package com.rfbike.scbapi.model.repository;

import com.rfbike.scbapi.model.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
