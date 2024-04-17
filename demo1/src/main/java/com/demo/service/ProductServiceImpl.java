package com.demo.service;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProductById(Long id, Product newProductData) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isPresent()) {
            Product existingProduct = optionalProduct.get();

            if (newProductData.getTitle() != null)
                existingProduct.setTitle(newProductData.getTitle());

            if (newProductData.getPrice() != null)
                existingProduct.setPrice(newProductData.getPrice());

            if (newProductData.getAuthor() != null)
                existingProduct.setAuthor(newProductData.getAuthor());

            if (newProductData.getAvailableQuantity() != null)
                existingProduct.setAvailableQuantity(newProductData.getAvailableQuantity());

            if (newProductData.getPageCount() != null)
                existingProduct.setPageCount(newProductData.getPageCount());

            if (newProductData.getTypeOfCover() != null)
                existingProduct.setTypeOfCover(newProductData.getTypeOfCover());

            if (newProductData.getCountryOfOrigin() != null)
                existingProduct.setCountryOfOrigin(newProductData.getCountryOfOrigin());

            if (newProductData.getWeight() != null)
                existingProduct.setWeight(newProductData.getWeight());

            if (newProductData.getDimensionX() != null)
                existingProduct.setDimensionX(newProductData.getDimensionX());

            if (newProductData.getDimensionY() != null)
                existingProduct.setDimensionY(newProductData.getDimensionY());

            if (newProductData.getDescription() != null)
                existingProduct.setDescription(newProductData.getDescription());

            return productRepository.save(existingProduct);
        } else {
            throw new NoSuchElementException("Product with ID"+ id +" was not found!");
        }
    }

    public void deleteProductById(Long id) {
        if (productRepository.findById(id).isPresent()) {
            productRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("Product with ID"+ id +" was not found!");
        }
    }
}
