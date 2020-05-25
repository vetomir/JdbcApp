package pl.gregorymartin.akademiaspringaw7.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
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

/*    @EventListener(ApplicationReadyEvent.class)
    public void init(){
        final String sql = "CREATE TABLE cars(car_id integer, mark VARCHAR (255), model VARCHAR (255), color VARCHAR (255), year int , PRIMARY KEY (car_id))";
        jdbcTemplate().update(sql);
    }*/
}
