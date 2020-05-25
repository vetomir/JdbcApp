package pl.gregorymartin.akademiaspringaw7.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class Config {

    public DataSource dataSource;

    @Autowired
    public Config(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource);
    }
}
