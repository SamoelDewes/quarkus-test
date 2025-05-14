package dewes.samoel.api.impl;

import java.util.List;

import dewes.samoel.api.UsuarioController;
import dewes.samoel.dto.UsuarioDTO;
import dewes.samoel.service.UsuarioService;
import jakarta.inject.Inject;

public class UsuarioControllerImpl implements UsuarioController {

	@Inject
	UsuarioService usuarioService;

	@Override
	public List<UsuarioDTO> listar() {
		return usuarioService.listar();
	}
	
	
	

}
