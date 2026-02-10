package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
   
    @GetMapping("/")
    public String getHomepage() {
        // Change "return Home.html;"
        // TO:
    	return "Home"; // Correct: Returns a String literal "Home"
    }
}