package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " +name.toUpperCase()+"!";

    }


    @GetMapping("hello/{name}")
@ResponseBody
    public String helloWithPathParam(@PathVariable String name){
        return "Hello " +name.toUpperCase()+"!";
    }

@GetMapping("form")

    public String helloForm(){
        return "form";
}

}
