package dewes.samoel.service.impl;

import java.util.List;

import dewes.samoel.dto.UsuarioDTO;
import dewes.samoel.repository.UsuarioRepository;
import dewes.samoel.service.UsuarioService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UsuarioServiceImpl implements UsuarioService {

	@Inject
	UsuarioRepository usuarioRepository;
	
	
	@Override
	public List<UsuarioDTO> listar() {
		return usuarioRepository.listar();
	}

}
