package dewes.samoel.repository.impl;

import java.util.List;
import java.util.stream.Collectors;

import dewes.samoel.dto.UsuarioDTO;
import dewes.samoel.model.UsuarioModel;
import dewes.samoel.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepositoryImpl implements UsuarioRepository {

	@Override
	public List<UsuarioDTO> listar() {

		List<UsuarioModel> usuarios = UsuarioModel.findAll().list();

		List<UsuarioDTO> usuariosDTO = usuarios.stream()
				.map(usuario -> new UsuarioDTO(usuario.getCodigo(), usuario.getNome(), usuario.getNascimento())).collect(Collectors.toList());

		return usuariosDTO;

	}

}
