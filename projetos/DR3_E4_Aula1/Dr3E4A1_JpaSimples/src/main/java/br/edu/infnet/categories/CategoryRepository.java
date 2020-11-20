package br.edu.infnet.categories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

    @PersistenceContext
    private EntityManager em;
    

    public void inserir(Category category) {
        
        em.persist(category);
    }
    
    public void alterar(Category category) {
        
        em.merge(category);
    }
    
    public void deletar(Category category) {
        
        em.remove(category);
    }
}
