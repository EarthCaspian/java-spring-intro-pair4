package com.pair4.pair4.spring.intro.workshop;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    List<Product> products = new ArrayList<>();

    @GetMapping
    public List<Product> getAll(){
        return products;
    }

    @GetMapping("getById/{id}")
    public void getById(@PathVariable int id){
        // to be continued
    }

    @PostMapping
    public String addProduct(@RequestBody Product product){
        products.add(product);
        return "Added";
    }
}
