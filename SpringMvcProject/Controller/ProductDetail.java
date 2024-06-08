package com.lcwd.mvc.SpringMvcProject.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

@RestController
public class ProductDetail {
    Logger logger = LoggerFactory.getLogger(ProductDetail.class);

    @GetMapping("/getProduct")
    public String getProduct(@RequestParam("Productname") String name,
                             @RequestParam("Id") int id,
                             @RequestParam("Salary" ) float sal){
        System.out.println("Name"+name);
        System.out.println("Id of Employee"+id);
        System.out.println("Salaray"+sal);

        return "fetching value from URL";
    }
    @GetMapping("/pathValue/{productName}/{productId}/{productRating}")
    public String getPathVariable(@PathVariable("productName") String name,
                                  @PathVariable int productId,
                                  @PathVariable int productRating){

        logger.info("Product Name {}",name);
        logger.error("Product {}",productId);
        logger.info("Product Rating {}",productRating);
//        System.out.println("Name"+name);
//        System.out.println("Id"+productId);
//        System.out.println("rating"+productRating);
        return "Testing path variable";
    }

}
