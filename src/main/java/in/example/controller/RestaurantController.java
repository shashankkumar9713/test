package in.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import in.example.service.RestaurantService;

@Controller
public class RestaurantController {

    private final RestaurantService service;

    public RestaurantController(RestaurantService service) {
        this.service = service;
    }

    @GetMapping("/restaurants")
    public String restaurants(Model model) {
        model.addAttribute("restaurants", service.getAllRestaurants());
        return "restaurants";
    }

    @GetMapping("/restaurant/{id}")
    public String menu(@PathVariable Long id, Model model) {
        model.addAttribute("foods", service.getFoodsByRestaurant(id));
        return "menu";
    }
}
