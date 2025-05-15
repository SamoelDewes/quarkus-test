package dewes.samoel.repository;

import java.util.List;

import dewes.samoel.dto.TarefaDTO;
import dewes.samoel.model.TarefaModel;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface TarefaRepository extends PanacheRepository<TarefaModel>{

	List<TarefaDTO> listar();
}
