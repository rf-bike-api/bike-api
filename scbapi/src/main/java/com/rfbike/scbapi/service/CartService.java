package com.rfbike.scbapi.service;

import com.rfbike.scbapi.api.dto.CartDTO;
import com.rfbike.scbapi.model.entity.Cart;
import com.rfbike.scbapi.model.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CartService {

    public CartRepository repository;

    public CartService (CartRepository repository) {
        this.repository = repository;
    }

    public List<CartDTO> getCarts() {
        List<CartDTO> list = repository.findAll().stream().map(CartDTO::create).collect(Collectors.toList());
        return list;
    }

    public CartDTO getCartById(Long id) {
        Optional<Cart> cart = repository.findById(id);
        return cart.map(CartDTO::create).orElseThrow(() -> new RuntimeException("Cart not found"));
    }
}
