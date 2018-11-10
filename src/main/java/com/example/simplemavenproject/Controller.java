package com.example.simplemavenproject;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/hi")
    String showMeSomething(){
         return "My Way";
    }
}
