package br.edu.infnet.actors.infrastructure;

import br.edu.infnet.actors.domain.Actor;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Short> { 
    
    List<Actor> findByFirstName(String firstName);
}
