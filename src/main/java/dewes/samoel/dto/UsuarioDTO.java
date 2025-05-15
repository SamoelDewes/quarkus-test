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
public class UsuarioDTO {

	private Long codigo;
	
	private String nome;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date nascimento;

}
