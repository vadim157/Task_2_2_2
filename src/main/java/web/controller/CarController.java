package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
//@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String show(@RequestParam(value = "count", required = false) Integer count, ModelMap models) {
        if (count == null || count > carService.showCars().size()) {
            models.addAttribute("cars", carService.showCars());
        } else {
            models.addAttribute("cars", carService.showCars(count));
        }
        return "cars/cars";
    }


}
