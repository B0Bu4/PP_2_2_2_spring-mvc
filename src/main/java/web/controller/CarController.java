package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;



@Controller
public class CarController {

    @RequestMapping(value = {"/cars"}, method = RequestMethod.GET)
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarService carService = new CarServiceImp();
        model.addAttribute("carList", carService.getCar(count));

        return "cars";
    }

}
