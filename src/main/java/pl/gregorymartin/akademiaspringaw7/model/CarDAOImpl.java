package pl.gregorymartin.akademiaspringaw7.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
class CarDAOImpl implements CarDAO{

    private JdbcTemplate jdbcTemplate;

    //

    public CarDAOImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    //

    public List<Car> GetByDate( Year from , Year to ) {
        final String sql = "SELECT * FROM videos";

        final List<Car> result = new ArrayList<>();

        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

        list.stream().forEach(element -> result.add(new Car(
                Long.parseLong(String.valueOf(element.get("car_id"))),
                String.valueOf(element.get("model")),
                String.valueOf(element.get("mark")),
                String.valueOf(element.get("color")),
                Year.parse(String.valueOf(element.get("year")))
        )));



        return result;
    }
}
