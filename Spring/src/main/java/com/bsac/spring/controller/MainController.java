package com.bsac.spring.controller;

import com.bsac.spring.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    @Autowired
    private MainService mainService;
    
    @GetMapping({ "/", "/index" })
    public String main(Model model) {
        model.addAttribute("hello", mainService.helloWorld());
        return "index";
    }
}
