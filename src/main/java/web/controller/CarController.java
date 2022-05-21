package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes-Benz", "Red", "H321KK99"));
        carList.add(new Car("Volga", "White", "M041AP50"));
        carList.add(new Car("Hyundai", "Silver", "X876YK197"));
        carList.add(new Car("Chevrolet", "Black", "C335TT177"));
        carList.add(new Car("BMW", "Blue", "A111MP77"));
    }

    @RequestMapping(value = { "/cars" }, method = RequestMethod.GET)
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarService carService = new CarServiceImp();
        model.addAttribute("carList", carService.getCar(carList, count));

        return "cars";
    }

}
