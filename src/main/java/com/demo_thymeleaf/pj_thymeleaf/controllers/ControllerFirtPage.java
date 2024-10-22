package com.demo_thymeleaf.pj_thymeleaf.controllers;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.demo_thymeleaf.pj_thymeleaf.models.ModelTable;
import com.demo_thymeleaf.pj_thymeleaf.models.ModelTable.EnumTypeAtr;
import com.demo_thymeleaf.pj_thymeleaf.services.ServiceCustomer;

@Controller
public class ControllerFirtPage {

    @Autowired
    ServiceCustomer service;

    @GetMapping("/first_page")
    public String ct_any_method(@RequestParam(name = "var", required = false, defaultValue = "Mundo" ) String name, Model model ) {
        model.addAttribute("name", name);
        return "TempFirstView";
    }
    

    @GetMapping("/list_page")
    public String ct_list_tables(Model model) {

        List<ModelTable> ls_tables = service.serv_list_customer();
        model.addAttribute("tables", ls_tables);

        return "TempListPage";
    }

    @PostMapping("/create_page")
    public RedirectView ct_create_tables(
        @RequestParam(name = "at_date") @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate tableDate,
        @RequestParam(name = "at_enum") EnumTypeAtr tableEnum,
        @RequestParam(name = "at_string") String tableString,
        @RequestParam(name = "at_number") Double tableDouble,
        @RequestParam(name = "at_char") String tableChar
    ) {
        ModelTable obj = ModelTable.builder()
            .tableDate( tableDate )
            .tableEnum( tableEnum )
            .tableString( tableString )
            .tableDouble( tableDouble )
            .tableChar( tableChar )
            .build();

        service.serv_add_customer(obj);

        return new RedirectView("/index.html");
    }
    
    
}
