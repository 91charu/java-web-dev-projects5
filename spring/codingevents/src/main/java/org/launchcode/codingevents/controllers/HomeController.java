package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("events")
public class HomeController {
    @GetMapping
    public String getIndex()
    {
        return "index";
    }
}
