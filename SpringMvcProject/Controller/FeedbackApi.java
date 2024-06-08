package com.lcwd.mvc.SpringMvcProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController()
public class FeedbackApi {

    @GetMapping("/getFeedback")
    public List<String>  getFeedBack(){
        List feed= Arrays.asList("Good","VeryGood","Excellent","Primary");
        return feed;
    }
    @PostMapping("/feed-back")
    public String CreatefeedBack(){
        System.out.println("feedback created");
        return"feed back created";
    }

}
