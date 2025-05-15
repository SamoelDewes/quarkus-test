package dewes.samoel.api;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import dewes.samoel.dto.TarefaDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path; 

@Tag(name = "Tarefa") 
@Path("Tarefa")
public interface TarefaController {
	
	@GET
	List<TarefaDTO> listar();

}
