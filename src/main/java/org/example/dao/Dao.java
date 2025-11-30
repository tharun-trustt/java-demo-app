package org.example.dao;

import org.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class Dao {

    public static final String HASH_KEY = "PRODUCT";



    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    public Product save(Product product){

        redisTemplate.opsForHash().put(HASH_KEY,product.getId(),product);
        return product;
    }

    public List<Product> findAll() {
        Map<Object, Object> entries = redisTemplate.opsForHash().entries(HASH_KEY);
        List<Product> products = new ArrayList<>();
        for (Object value : entries.values()) {
            products.add((Product) value);
        }

        return products;
    }

}
