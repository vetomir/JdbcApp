package pl.gregorymartin.akademiaspringaw7.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.gregorymartin.akademiaspringaw7.model.Car;
import pl.gregorymartin.akademiaspringaw7.model.CarDAOImpl;

@Controller
public class View {

    private CarDAOImpl carDAO;

    public View(final CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping
    public String getAllCars(Model model, @RequestParam(name = "from",defaultValue = "0") int from, @RequestParam( name = "to", defaultValue = "2050") int to) {
        model.addAttribute("car", carDAO.GetAll());
        model.addAttribute("carFilter", carDAO.GetByDate(from, to));
        model.addAttribute("newCar", new Car());
        return "carapp";
    }


    @GetMapping("/filter")
    public String getCarsByYear( int from, int to) {
        return "redirect/:?from=" + from + "&to=" + to;
    }
}

