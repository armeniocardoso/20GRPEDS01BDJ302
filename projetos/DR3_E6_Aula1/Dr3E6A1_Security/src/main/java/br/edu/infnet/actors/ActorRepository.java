package br.edu.infnet.actors;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<Actor> listar() {
        
        return em.createNamedQuery("Actor.findAll").getResultList();
    }
}
