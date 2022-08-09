package com.rfbike.scbapi.model.repository;

import com.rfbike.scbapi.model.entity.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
}
