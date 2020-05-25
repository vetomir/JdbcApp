package pl.gregorymartin.akademiaspringaw7.model;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CarDAOImpl implements CarDAO{

    private JdbcTemplate jdbcTemplate;

    //

    public CarDAOImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    //


    @Override
    public void save(final Car car) {
        final String sql = "INSERT INTO cars VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, car.getId(), car.getMark(), car.getModel(),car.getColor(),car.getYear());
    }

    @Override
    public List<Car> GetAll() {
        final String sql = "SELECT * FROM cars";

        final List<Car> result = new ArrayList<>();

        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

        list.stream().forEach(element -> result.add(new Car(
                Long.parseLong(String.valueOf(element.get("car_id"))),
                String.valueOf(element.get("model")),
                String.valueOf(element.get("mark")),
                String.valueOf(element.get("color")),
                Integer.parseInt(String.valueOf(element.get("year")))
        )));

        System.out.println(result);
        return result;
    }

    @Override
    public List<Car> GetByDate(int from , int to ) {
        final String sql = "SELECT * FROM cars WHERE year BETWEEN ? AND ?";

        final List<Car> result = new ArrayList<>();

        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql,from,to);

        list.stream().forEach(element -> result.add(new Car(
                Long.parseLong(String.valueOf(element.get("car_id"))),
                String.valueOf(element.get("mark")),
                String.valueOf(element.get("model")),
                String.valueOf(element.get("color")),
                Integer.parseInt(String.valueOf(element.get("year")))
        )));

        System.out.println(result);
        return result;
    }
}
