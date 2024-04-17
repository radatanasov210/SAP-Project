package com.demo.service;

import com.demo.model.Cart;
import com.demo.model.User;
import com.demo.repository.CartRepository;
import com.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    @Autowired
    public CartServiceImpl(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Cart createCart(@AuthenticationPrincipal User user) {

        Cart cart = new Cart();
        cart.setUser(user);
        return cart;
    }


}
