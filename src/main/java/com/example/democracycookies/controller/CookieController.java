package com.example.democracycookies.controller;

import com.example.democracycookies.model.Сookies;
import com.example.democracycookies.repository.CookiesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class CookieController {

    public CookieController(CookiesRepository cookiesRepository) {
        this.cookiesRepository = cookiesRepository;
    }

    private final CookiesRepository cookiesRepository;

    @GetMapping("/greeting")
    public String greeting(Map<String, Object> model) {
        Iterable<Сookies> сookies = cookiesRepository.findAll();
        model.put("cookies", сookies);
        return "greeting.html";
    }

    @PostMapping("/greeting")
    public String saveCookies(@ModelAttribute Сookies cookies, Map<String, Object> model){
        cookiesRepository.save(cookies);
        Iterable<Сookies> сookies = cookiesRepository.findAll();
        model.put("cookies", сookies);
        return "greeting.html";

    }

//    @PostMapping("/save")
//    public String addCookies(@RequestParam String description,
//                             @RequestParam String tag,
//                             Map<String, Object> model){
//        Сookies cookie = new Сookies(description,tag);
//        cookiesRepository.save(cookie);
//        Iterable<Сookies> сookies =
//                cookiesRepository.findAll();
//        model.put("cookies", сookies);
//        return "greeting.html";
//
//    }

//@Controller
//public class CookieController {
//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting.html";
//    }


//@RestController
//public class CookieController {
//
//    @GetMapping("/greeting")
//    public ModelAndView greeting(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("greeting.html");
//        return modelAndView;
//    }


}
