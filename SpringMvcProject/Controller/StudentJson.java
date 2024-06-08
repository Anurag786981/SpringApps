package com.lcwd.mvc.SpringMvcProject.Controller;

import com.lcwd.mvc.SpringMvcProject.Model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Key;
import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentJson {

    /*
      we Need to take data from JSON

      We are receiving data in JSOn
     */


    //    @PostMapping("/studentCreation")
//    public String createStudent(@RequestBody  Map<String,Object> Data){
//        System.out.println(Data);
//        return "studentcreated";
//    }
    @PostMapping("/studentCreation")
    public List<Student> createStudent(@RequestBody List<Student> student) {
        System.out.println(student);
        return student;
    }
    @PostMapping("/FoodCreate")
    public Map<String,Object> createFood(@RequestBody List<Student> student) {

        Map<String, Object> food = new HashMap<>();
        food.put("Content", student);
        food.put("Burger", "rate");
        food.put("Current date", new Date());

        return food;

    }
     @PostMapping("/httpValidate")
    public ResponseEntity<Student> customHttp(@RequestBody List<Student> students){



        
        Student student = students.get(0);
        student.setAge(34);
        ResponseEntity<Student> res = new ResponseEntity<>(student, HttpStatus.CREATED) ;
        return res;

    }

}

