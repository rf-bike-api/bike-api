package com.rfbike.scbapi.api.controller;

import com.rfbike.scbapi.api.dto.CartDTO;
import com.rfbike.scbapi.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vi/carts")
@AllArgsConstructor
public class CartController {

    public final CartService service;

    @GetMapping()
    public ResponseEntity get() {
        List<CartDTO> cartList = service.getCarts();
        return ResponseEntity.ok(cartList);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        CartDTO cart = service.getCartById(id);
        return ResponseEntity.ok(cart);
    }
}
