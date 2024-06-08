package com.lcwd.mvc.SpringMvcProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/java8")
public class Java8Controller {

    @GetMapping("/filtered")
    public List<Integer> evenNo(){
        List<Integer> values = Arrays.asList(2,3,4,5);
        List<Integer> OperationList= values.stream().filter(a-> a%2==0).collect(Collectors.toList());
        return OperationList;
    }
    @GetMapping("/mapSorted")
    public List<String> mapString(){
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Emily");
        List<String> sortedList= names.stream()
                                .map(String:: toUpperCase).
                                    collect(Collectors.toList());
        return sortedList;
    }
    @GetMapping("/sortingJava8")
    public List<String> sortingofString(){
        List<String> list = Arrays.asList("Anurag","Vijay","Baba");
        List<String> sortedList= list.stream().sorted((a,b) -> b.compareTo(a)
        ).collect(Collectors.toList());
        return sortedList;
    }
    @GetMapping("/integerSorting")
    public Set<Integer> sortingOfInteger(){
        Set<Integer> set=new TreeSet<>((a, b)->b-a);
        set.add(23);
        set.add(2);
        set.add(67);
        return set;
    }
}
