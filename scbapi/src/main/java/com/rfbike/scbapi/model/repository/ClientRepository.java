package com.rfbike.scbapi.model.repository;

import com.rfbike.scbapi.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
