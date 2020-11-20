package br.edu.infnet;

import br.edu.infnet.servicos.Servico1;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Dr3E5A1HelloSpringBootApplication implements CommandLineRunner {
    
    @Autowired
    private Servico1 servico1;
    @Autowired
    private ApplicationContext applicationContext;
    
    private Logger LOG = LoggerFactory.getLogger(Dr3E5A1HelloSpringBootApplication.class);
    
    //CLI ---> Command Line Interface
    public static void main(String[] args) {
        
        SpringApplication.run(Dr3E5A1HelloSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        LOG.info("Hello Spring Boot World!!!!!");
        servico1.executar();
        String [] beans = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            
            LOG.info("\t" + bean);
        }
    }
}
