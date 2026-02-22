package in.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import in.example.service.CartService;

@Controller
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping("/add-to-cart")
    public String add(@RequestParam String name,
                      @RequestParam double price) {
        service.addItem(name, price);
        return "redirect:/cart";
    }

    @PostMapping("/remove-from-cart")
    public String remove(@RequestParam String name) {
        service.removeItem(name);
        return "redirect:/cart";
    }

    @GetMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("items", service.getCartItems());
        return "cart";
    }
}
