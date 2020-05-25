package pl.gregorymartin.akademiaspringaw7.model;

import java.time.Year;
import java.util.List;

public interface CarDAO {

    List<Car> GetByDate(Year from, Year to);

}
