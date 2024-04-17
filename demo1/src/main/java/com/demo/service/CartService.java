package com.demo.service;

import com.demo.model.Cart;
import com.demo.model.Product;
import com.demo.model.User;
import com.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface CartService {
    public Cart createCart(User user);

    List<Cart> findCartsByUser(User user);
    List<Cart> findCartsByUserId(Long id);

    void addProductToCart(Cart cart, Product product, int quantity);

    void removeProductFromCart(Cart cart, Product product);

    Cart updateProductQuantity(Cart cart, Product product, int quantity);

    void clearCart(Cart cart);
}
