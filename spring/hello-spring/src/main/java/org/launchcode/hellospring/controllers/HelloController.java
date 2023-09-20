package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value="hello")
public class HelloController {


    /*@GetMapping("hello")
    @ResponseBody
    public String hello()
    {
        return "Hello, Spring!";
    }*/


    @GetMapping("goodbye")
    public String goodbye()
    {
        return "Goodbye, Spring!";
    }


    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " +name.toUpperCase()+"!";

    }


    @GetMapping("{name}")

    public String helloWithPathParam(@PathVariable String name){
        return "Hello " +name.toUpperCase()+"!";
    }

@GetMapping("form")

    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<input type = 'text' name = 'name'>"+
                "<input type='submit' value='Greet Me!'>" +
                        "</form>" +
                "</body>" +
                "</html>";
}

}
