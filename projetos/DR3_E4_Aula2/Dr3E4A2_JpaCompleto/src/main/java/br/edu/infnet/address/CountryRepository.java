package br.edu.infnet.address;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@EnableTransactionManagement
@Repository
public class CountryRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<Country> listar() {
        
        return em.createNamedQuery("Country.findAllWithCities").getResultList();
    }
    
    @Transactional
    public void inserir(Country country) {
        
        em.persist(country);
    }
}
