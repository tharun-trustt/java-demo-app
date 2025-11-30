package org.example.controller;


import org.example.dao.Dao;
import org.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private Dao dao;

    @PostMapping("/create")
    public Product save(@RequestBody Product product){
        return dao.save(product);

    }

@GetMapping("/get")
    public List<Product> findAll(){
        return dao.findAll();

    }
}
