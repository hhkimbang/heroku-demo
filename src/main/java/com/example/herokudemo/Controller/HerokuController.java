package com.example.herokudemo.Controller;

import com.example.herokudemo.service.User;
import com.example.herokudemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HerokuController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/home", "/"})
    public String getHome(Model model) {
        List<User> users = this.userService.getAll();
        model.addAttribute("users", users);
        return "home";
    }
}
