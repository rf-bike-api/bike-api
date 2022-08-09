package com.rfbike.scbapi.model.repository;

import com.rfbike.scbapi.model.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
