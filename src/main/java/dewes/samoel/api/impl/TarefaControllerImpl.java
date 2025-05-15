package dewes.samoel.api.impl;

import java.util.List;

import dewes.samoel.api.TarefaController;
import dewes.samoel.dto.TarefaDTO;
import dewes.samoel.service.TarefaService;
import jakarta.inject.Inject;

public class TarefaControllerImpl implements TarefaController {

	@Inject
	TarefaService tarefaService;
	
	@Override
	public List<TarefaDTO> listar() {
		return tarefaService.listar();
	}

}
