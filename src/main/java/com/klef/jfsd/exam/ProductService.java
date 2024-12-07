package com.klef.jfsd.exam;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final String apiUrl = "https://fakestoreapi.com/products";

    public List<Product> getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
        Product[] products = restTemplate.getForObject(apiUrl, Product[].class);
        return Arrays.asList(products);
    }
}
