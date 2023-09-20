package org.launchcode.controllerexercises.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value ="hello")
public class HelloController {

    /*@GetMapping("hello")
    public String hello(){
        return "Hello, World!";
    }*/




    @GetMapping("{name}")

    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST}, value="hello")
    public String helloParam(@RequestParam String name, @RequestParam String language){
        // Default to English if the language is not provided or not supported
        if ("French".equals(language)) {
            return "Bonjour " + name.toUpperCase();
        }
        else if("Spanish".equals(language)) {

            return "Hola " + name.toUpperCase();
        }
            else if("German".equals(language)) {
            return "Guten Tag " + name.toUpperCase();
        }
            else if("Italian".equals(language)) {
            return "Ciao " + name.toUpperCase();
        }
            else{

                return "Hello " + name.toUpperCase();
        }
    }


@GetMapping("form")
    public String helloLang(){
    return "<html>" +
            "<body>" +
            "<form action='hello' method='post'>" +
            "<input type='text' name='name'>" +
            "<select name='language'>" +
            "<option value='English'>English</option>" +
            "<option value='French'>French</option>" +
            "<option value='Spanish'>Spanish</option>" +
            "<option value='German'>German</option>" +
            "<option value='Italian'>Italian</option>" +
            "</select>" +
            "<input type='submit' value='Greet Me!'>" +
            "</form>" +
            "</body>" +
            "</html>" ;
}


}
