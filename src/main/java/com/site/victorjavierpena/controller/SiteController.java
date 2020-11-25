package com.site.victorjavierpena.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

        @GetMapping(value={"/"})
        public String home(){
            return "pages/homePage";
        }

        @GetMapping(value={"/resume"})
        public String resume() {
            return "pages/resume";
        }

        @GetMapping(value={"/projects"})
        public String project() {
            return "pages/projects";
        }

        @GetMapping(value={"/contact"})
        public String contact() {
            return "pages/contact" +
                    "";
        }
}
