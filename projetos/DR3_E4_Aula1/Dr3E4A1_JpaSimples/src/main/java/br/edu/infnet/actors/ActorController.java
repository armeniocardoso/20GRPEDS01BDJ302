package br.edu.infnet.actors;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActorController {
    
    @Autowired
    private ActorRepository actorRepository;
    
    @RequestMapping("/actors/listar")
    public ModelAndView listarAtores() {
        
        ModelAndView retorno = new ModelAndView("actors/index");
        List<Actor> listaDeAtores = actorRepository.listar();
        if(listaDeAtores != null && !listaDeAtores.isEmpty()) {
            
            retorno.addObject("atores", listaDeAtores);
        } else {
            
            retorno.addObject("mensagem", "Não existem dados para exibir");
        }
        return retorno;
    }
}
