package com.lcwd.mvc.SpringMvcProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperMan {


    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Processing about Request");
        return "about";
    }

    @RequestMapping("/services")
    public String aboutServices(){
       return "services";
    }
}
