package sia.taco_cloud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping ("/")
    public String home() {
        System.out.println("\nJR info: Accesing home...");
        return "home";
    }
}