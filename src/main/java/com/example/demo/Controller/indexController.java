package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    //跳转到index界面...
    @RequestMapping("/index")
    public String index(Model model) {
        
        model.addAttribute("name", "index");
        return "index";
    }
    
    //跳转到login界面...
    @RequestMapping("/login")
    public String login() {
        return "redirect:login";
    }
}