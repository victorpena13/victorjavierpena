package com.site.victorjavierpena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class siteController {

    @GetMapping(value={"/"})
    public String home(){
        return "pages/homePage";
    }

}
