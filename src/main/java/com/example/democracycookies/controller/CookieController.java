package com.example.democracycookies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CookieController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting.html";
    }

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
