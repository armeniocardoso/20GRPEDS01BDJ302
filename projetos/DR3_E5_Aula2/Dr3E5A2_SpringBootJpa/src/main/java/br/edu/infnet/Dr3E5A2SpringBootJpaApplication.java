package br.edu.infnet;

import br.edu.infnet.actors.api.ActorController;
import br.edu.infnet.actors.domain.Actor;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dr3E5A2SpringBootJpaApplication implements CommandLineRunner {

    @Autowired
    private ActorController actorController;

    private Logger logger = LoggerFactory.getLogger(Dr3E5A2SpringBootJpaApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(Dr3E5A2SpringBootJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Iterable<Actor> actorsList = actorController.findAll();
        for (Actor actor : actorsList) {

            logger.info(actor.getActorId() + " - "
                    + actor.getFirstName() + " "
                    + actor.getLastName());
        }
        //----------------------------------------------------------------------
        logger.info("------------------------");
        List<Actor> list = actorController.findByFirstName("JOHNNY");
        for (Actor actor : list) {

            logger.info(actor.getActorId() + " - "
                    + actor.getFirstName() + " "
                    + actor.getLastName());
        }
    }
}
