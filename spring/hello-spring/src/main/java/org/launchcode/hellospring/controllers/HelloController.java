package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@ResponseBody
//@RequestMapping(value="hello")
public class HelloController {


    /*@GetMapping("hello")
    @ResponseBody
    public String hello()
    {
        return "Hello, Spring!";
    }*/


    //@GetMapping("goodbye")
    //@ResponseBody
    //public String goodbye()
    //{
      //  return "Goodbye, Spring!";
    //}


    @RequestMapping(value = "hello", method={RequestMethod.GET,RequestMethod.POST})
//@ResponseBody
    public String helloWithQueryParam(@RequestParam String name, Model model){
        String greeting ="hello, "+name+"!";
        model.addAttribute("greeting",greeting);
        return "hello";

    }


    @GetMapping("hello/{name}")
//@ResponseBody
    public String helloWithPathParam(@PathVariable String name, Model model){

        String greeting ="hello, "+name+"!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }

@GetMapping("form")

    public String helloForm(){
        return "form";
}
@GetMapping("hello-names")
public String helloNames(Model model){
     List<String> names=new ArrayList<>();
     names.add("Launchcode");
     names.add("Java");
     names.add("Javascript");
     model.addAttribute("names", names);
        return "hello-list";
}
}
