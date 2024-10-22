package com.demo_thymeleaf.pj_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerFirstPage {

    @GetMapping("/first_page")
    public String ct_redirect_model_view() {
        return "TempFirstView";
    }
}
