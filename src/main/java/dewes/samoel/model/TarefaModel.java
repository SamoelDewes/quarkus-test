package dewes.samoel.model;

import java.util.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@RegisterForReflection
@Getter
@Setter
@Table(name = "tarefa")
public class TarefaModel extends PanacheEntityBase {

	@Id
	@Column(name = "codigo")
	private Long codigo;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "criacao")
	private Date criacao;
	
	@Column(name = "realizado")
	private Boolean realizado;
}
