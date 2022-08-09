package com.rfbike.scbapi.model.repository;

import com.rfbike.scbapi.model.entity.AccessoryType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessoryTypeRepository extends JpaRepository<AccessoryType, Long> {
}
