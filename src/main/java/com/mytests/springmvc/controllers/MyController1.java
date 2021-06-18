package com.mytests.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController1 {

    @RequestMapping("/java")
    public String java(ModelMap model) {
        model.addAttribute("java_attr1", "java_view");
        return "java_view";
    }
}
