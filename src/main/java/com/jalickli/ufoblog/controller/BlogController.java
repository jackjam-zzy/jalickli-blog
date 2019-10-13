package com.jalickli.ufoblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @GetMapping("/list/{action}")
    public String blogList(@PathVariable(name = "action")String action,
                           Model model){
        if("questions".equals(action)){
            model.addAttribute("section","questions");
            model.addAttribute("sectionName","我的博文");
        }
        return "bloglist";
    }
}
