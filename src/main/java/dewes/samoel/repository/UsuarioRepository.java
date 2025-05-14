package dewes.samoel.repository;

import java.util.List;

import dewes.samoel.dto.UsuarioDTO;
import dewes.samoel.model.UsuarioModel;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface UsuarioRepository extends PanacheRepository<UsuarioModel>{
	List<UsuarioDTO> listar();
}
