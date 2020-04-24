package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "index");
        return "index";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "redirect:login";
    }
}