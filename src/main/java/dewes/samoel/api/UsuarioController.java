package dewes.samoel.api;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import dewes.samoel.dto.UsuarioDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Tag(name = "Usuario")
@Path("Usuario")
public interface UsuarioController {

	@GET
	List<UsuarioDTO> listar();
	
}
