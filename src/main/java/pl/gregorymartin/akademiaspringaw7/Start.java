package pl.gregorymartin.akademiaspringaw7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregorymartin.akademiaspringaw7.model.Car;
import pl.gregorymartin.akademiaspringaw7.model.CarDAOImpl;

import java.time.Year;

@Controller
@RequestMapping
class Start {

    CarDAOImpl carDAO;

    public Start(final CarDAOImpl carDAO) {
        this.carDAO = carDAO;




    }

    @GetMapping("/check")
    public void run(){
/*        Car car1 = new Car(1l, "Toyota", "Prius", "Black", 2004);
        Car car2 = new Car(2l, "Bmw", "F10", "red", 2005);
        Car car3 = new Car(3l, "RR", "Phantom", "blue", 2001);
        Car car4 = new Car(4l, "Volvo", "s90", "yellow", 2003);
        Car car5 = new Car(5l, "Toyota", "Yaris", "Black", 2011);
        Car car6 = new Car(6l, "Audi", "A7", "red", 2015);
        Car car7 = new Car(7l, "Jeep", "Compass", "blue", 2018);
        Car car8 = new Car(8l, "Fiat", "Punto", "yellow", 2020);
        Car car9 = new Car(9l, "Jaguar", "XF", "Black", 2017);
        Car car10 = new Car(10l, "Mercedes", "C", "red", 2019);
        Car car11 = new Car(11l, "Volkswagen", "Passat", "blue", 2011);
        Car car12 = new Car(12l, "Volvo", "c30", "yellow", 2013);

        carDAO.save(car1);
        carDAO.save(car2);
        carDAO.save(car3);
        carDAO.save(car4);
        carDAO.save(car5);
        carDAO.save(car6);
        carDAO.save(car7);
        carDAO.save(car8);
        carDAO.save(car9);
        carDAO.save(car10);
        carDAO.save(car11);
        carDAO.save(car12);*/


        carDAO.GetByDate(2003, 2003);
    }
}
