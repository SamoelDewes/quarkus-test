package dewes.samoel.service.impl;

import java.util.List;

import dewes.samoel.dto.TarefaDTO;
import dewes.samoel.repository.TarefaRepository;
import dewes.samoel.service.TarefaService;
import jakarta.inject.Inject;

public class TarefaServiceImpl implements TarefaService {

	@Inject
	TarefaRepository tarefaRepository;
	
	@Override
	public List<TarefaDTO> listar() {
		return tarefaRepository.listar();
	}

}
