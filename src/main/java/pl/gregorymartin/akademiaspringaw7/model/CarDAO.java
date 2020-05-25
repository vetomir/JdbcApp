package pl.gregorymartin.akademiaspringaw7.model;

import java.time.Year;
import java.util.List;

public interface CarDAO {

    List<Car> GetByDate(int from, int to);

    List<Car> GetAll();

    void save(Car car);

}
