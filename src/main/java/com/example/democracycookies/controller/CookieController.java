package com.example.democracycookies.controller;

import com.example.democracycookies.model.Product;
import com.example.democracycookies.repository.CookiesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class CookieController {

    public CookieController(CookiesRepository cookiesRepository) {
        this.cookiesRepository = cookiesRepository;
    }

    private final CookiesRepository cookiesRepository;

    @GetMapping("/greeting")
    public String greeting(Map<String, Object> model) {
        Iterable<Product> products = cookiesRepository.findAll();
        model.put("cookies", products);
        return "greeting.html";
    }

    @PostMapping("/greeting")
    public String saveCookies(@ModelAttribute Product cookies, Map<String, Object> model){
        cookiesRepository.save(cookies);
        Iterable<Product> products = cookiesRepository.findAll();
        model.put("cookies", products);
        return "greeting.html";

    }

}
