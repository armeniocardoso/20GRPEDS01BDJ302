package br.edu.infnet.actors.api;

import br.edu.infnet.actors.domain.Actor;
import br.edu.infnet.actors.infrastructure.ActorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/actors")
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Actor> findAll() {
        
        return actorRepository.findAll();
    }
    
    public List<Actor> findByFirstName(String firstName) {
        
        return actorRepository.findByFirstName(firstName);
    }
}
