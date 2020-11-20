package br.edu.infnet.servicos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

//@Component
@Service
//@Repository
//@Controller
public class Servico1 {
    
    private Logger LOG = LoggerFactory.getLogger(Servico1.class);
    
    public void executar() {
        
        LOG.info("Executando o Serviço 1....Agora!");        
    }
}
