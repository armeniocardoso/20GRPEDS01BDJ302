package br.edu.infnet.contatos;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource("classpath:/br/edu/infnet/contatos/ContatoRepository.xml")
public class ContatoRepository extends JdbcDaoSupport {

    @Autowired
    private Environment queries;

    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {

        this.setDataSource(this.dataSource);
    }

    public List<Contato> listar() {

        String sql = queries.getProperty("ContatoRepository.listar");
        BeanPropertyRowMapper rowMapper = new BeanPropertyRowMapper(Contato.class);
        return this.getJdbcTemplate().query(sql, rowMapper);
    }

    public Contato obter(Integer id) {

        String sql = queries.getProperty("ContatoRepository.obter");
        BeanPropertyRowMapper rowMapper = new BeanPropertyRowMapper(Contato.class);
        Object[] params = new Object[]{
            id
        };
        return (Contato) this.getJdbcTemplate().queryForObject(sql, params, rowMapper);
    }

    public void inserir(Contato contato) {

        String sql = queries.getProperty("ContatoRepository.inserir");
        Object[] params = new Object[]{
            contato.getNome(),
            contato.getEmail(),
            contato.getFone()
        };
        this.getJdbcTemplate().update(sql, params);
    }

    public void alterar(Contato contato) {

        String sql = queries.getProperty("ContatoRepository.alterar");
        Object[] params = new Object[]{
            contato.getNome(),
            contato.getEmail(),
            contato.getFone(),
            contato.getId()
        };
        this.getJdbcTemplate().update(sql, params);
    }
}
