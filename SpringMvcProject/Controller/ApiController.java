package com.lcwd.mvc.SpringMvcProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.Arrays;
import java.util.List;

@RestController()
//@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value ="/hello", method = RequestMethod.GET)
   // @ResponseBody
    public String helloApi(){
        return "Hello this my world";
    }

    @RequestMapping( value ="/users", method = RequestMethod.GET)
   // @ResponseBody
    public List<String> getusers(){
        return Arrays.asList("Ram","Shyam","Anurag","Vijay");
    }
    @RequestMapping(value = "/user-create", method = RequestMethod.POST)
    public String creatingUser(){
        System.out.println("user creating");
        return "User created";
    }
}
