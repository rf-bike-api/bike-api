package com.rfbike.scbapi.service;

import com.rfbike.scbapi.model.entity.Cart;
import com.rfbike.scbapi.model.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    public CartRepository repository;

    public CartService (CartRepository repository) {
        this.repository = repository;
    }

    public List<Cart> getCarts() {
        return repository.findAll();
    }

    public Optional<Cart> getCartById(Long id) {
        return repository.findById(id);
    }
}
