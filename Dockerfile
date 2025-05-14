# COMANDO = docker build -t quarkus-teste .
# COMANDO = docker build --progress=plain -t quarkus-teste .

# ETAPA 1 ---------------------------------------------

#Cria uma imagem do ubuntu
FROM ubuntu:latest as build

#Atualiza os repositórios do ubuntu e instala o java e o maven
RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
RUN apt-get install maven -y

#Seta o diretorio do docker para /app (apenas por convenção)
WORKDIR /app


#Copia os arquivos para dentro do diretorio do docker
# Primeiro . é onde estou executando o comando docker no cmd
# Segundo . é o diretorio do docker, no caso /app
COPY . .

#Compila o pacote pulando os testes
RUN mvn package -DskipTests

#Mostra os arquivos do diretorio
RUN ls -la

# ETAPA 2 ---------------------------------------------

#Cria uma imagem do JDK
FROM openjdk:21-slim

#Seta o diretorio do docker para /app (apenas por convenção)
WORKDIR /app


#Copia os arquivos compilados na etapa 1
COPY --from=build /app/target/quarkus-app /app/quarkus-app

#Faz o container escutar a porta 8080
EXPOSE 8080

#Roda o comando executando o arquivo
ENTRYPOINT ["java", "-jar", "/app/quarkus-app/quarkus-run.jar"]