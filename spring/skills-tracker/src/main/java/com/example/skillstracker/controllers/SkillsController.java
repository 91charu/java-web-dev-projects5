package com.example.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillsController {

    @GetMapping("/")
    public String skillstracker() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few Skills we would like to learn.Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/")
    //@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/form")
    public String skillsForm(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
        String response = "<html><body><h1>" + name + "</h1>";
        response += "<style>h3 { margin: 0; }</style>";
        // Process lang1
        if (lang1.equals("JavaScript")) {
            response += "<h3>1.JavaScript<br></h3>";
        } else if (lang1.equals("Python")) {
            response += "<h3>1.Python<br></h3>";
        } else {
            response += "<h3>1.Java<br></h3>";
        }

        // Process lang2
        if (lang2.equals("JavaScript")) {
            response += "<h3>2.JavaScript<br></h3>";
        } else if (lang2.equals("Python")) {
            response += "<h3>2.Python<br></h3>";
        } else {
            response += "<h3>2.Java<br></h3>";
        }

        // Process lang3
        if (lang3.equals("JavaScript")) {
            response += "<h3>3.JavaScript<br></h3>";
        } else if (lang3.equals("Python")) {
            response += "<h3>3.Python<br></h3>";
        } else {
            response += "<h3>3.Java<br></h3>";
        }

        response += "</body></html>";
        return response;
    }
    @GetMapping("{form}")
    public String helloLang(){
        return "<html>" +
                "<body>" +
                "<form action='/' method='post'>" +
                "Name: <input type='text' name='name'><br>" +
                "My favorite language<br><select name='lang1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "My favorite second language<br><select name='lang2'>" +
                "<option value='Java'>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>"+
                "My favorite third language<br><select name='lang3'>"+
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>"+
                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>" ;
    }
}
