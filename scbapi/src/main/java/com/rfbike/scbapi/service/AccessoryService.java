package com.rfbike.scbapi.service;

import com.rfbike.scbapi.model.entity.Accessory;
import com.rfbike.scbapi.model.repository.AccessoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccessoryService {

    private AccessoryRepository repository;

    public AccessoryService(AccessoryRepository repository){
        this.repository = repository;
    }

    public List<Accessory> getAccessories() {
        return repository.findAll();
    }

    public Optional<Accessory> getAccessoryById(Long id) {
        return repository.findById(id);
    }
}
