package com.demo.controller;

import com.demo.model.Product;
import com.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/register")
    public Product registerProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/get/all")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/get/{productId}")
    public Optional<Product> getProduct(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }

    @PutMapping("/modify/{productId}")
    public ResponseEntity<Product> updateProductById(@PathVariable Long productId, @RequestBody Product newProductData) {
        Product updatedProduct = productService.updateProductById(productId, newProductData);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/delete/{productId}")
    public void deleteProductById(@PathVariable Long productId) {
        productService.deleteProductById(productId);
    }
}
