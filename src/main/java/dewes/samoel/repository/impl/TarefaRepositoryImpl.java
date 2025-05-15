package dewes.samoel.repository.impl;

import java.util.List;
import java.util.stream.Collectors;

import dewes.samoel.dto.TarefaDTO;
import dewes.samoel.model.TarefaModel;
import dewes.samoel.repository.TarefaRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TarefaRepositoryImpl implements TarefaRepository {

	@Override
	public List<TarefaDTO> listar() {
		List<TarefaModel> tarefas = TarefaModel.findAll().list();

		List<TarefaDTO> tarefasDTO = tarefas.stream().map(tarefa -> new TarefaDTO(tarefa.getCodigo(),
				tarefa.getDescricao(), tarefa.getCriacao(), tarefa.getRealizado())).collect(Collectors.toList());

		return tarefasDTO;
	}

}
