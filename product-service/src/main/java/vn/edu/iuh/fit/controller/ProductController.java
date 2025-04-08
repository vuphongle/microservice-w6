package vn.edu.iuh.fit.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public String getProductById(@PathVariable String id) {
        return "Product with ID: " + id;
    }
}
