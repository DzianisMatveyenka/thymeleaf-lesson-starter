package com.matveyenka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {

    @GetMapping("/pizza")
    public String openPizzaFormPage() {
        return "pizza";
    }
}
