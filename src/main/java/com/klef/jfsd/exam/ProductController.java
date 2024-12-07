package com.klef.jfsd.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> fetchAllProducts() {
        return productService.getAllProducts();
    }
    @PostMapping("/add-product")
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        // Here, you would normally save the product to a database or process it
        System.out.println("Received product: " + product.getTitle());
        return ResponseEntity.ok("Product added successfully!");
    }

}

