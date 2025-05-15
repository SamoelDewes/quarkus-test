package dewes.samoel.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RegisterForReflection
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TarefaDTO {
	
	private Long codigo;
	
	private String descricao;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date criacao;
	
	private Boolean realizado;

}
