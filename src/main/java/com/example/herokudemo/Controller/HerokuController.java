package com.example.herokudemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HerokuController {

    @GetMapping(value = {"/home", "/"})
    public String getHome() {
        return "home";
    }
}
