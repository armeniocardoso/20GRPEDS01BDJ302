package br.edu.infnet.countries;

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
@PropertySource("classpath:/br/edu/infnet/countries/CountryRepository.xml")
public class CountryRepository extends JdbcDaoSupport {

    //--------------------------------------------------------------------------
    //Ações necessárias para a injeção das queries pelo Spring
    @Autowired
    private Environment queries;

    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {

        this.setDataSource(this.dataSource);
    }
    //--------------------------------------------------------------------------

    public List<Country> listAll() {

        String sql = queries.getProperty("CountryRepository.listAll");
        BeanPropertyRowMapper rowMapper = new BeanPropertyRowMapper(Country.class);
        return this.getJdbcTemplate().query(sql, rowMapper);
    }
}
