package com.demo.service;

import com.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);

    Product saveProduct(Product product);

    Product updateProductById(Long id, Product newUserData);

    void deleteProductById(Long id);
}
