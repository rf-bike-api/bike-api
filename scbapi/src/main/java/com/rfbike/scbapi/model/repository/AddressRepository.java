package com.rfbike.scbapi.model.repository;

import com.rfbike.scbapi.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
