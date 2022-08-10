package com.rfbike.scbapi.service;

import com.rfbike.scbapi.api.dto.AccessoryDTO;
import com.rfbike.scbapi.model.entity.Accessory;
import com.rfbike.scbapi.model.repository.AccessoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccessoryService {

    private AccessoryRepository repository;

    public AccessoryService(AccessoryRepository repository){
        this.repository = repository;
    }

    public List<AccessoryDTO> getAccessories() {
        List<AccessoryDTO> list = repository.findAll().stream().map(AccessoryDTO::create).collect(Collectors.toList());
        return list;
    }

    public AccessoryDTO getAccessoryById(Long id) {
        Optional<Accessory> accessory = repository.findById(id);
        return accessory.map(AccessoryDTO::create).orElseThrow(() -> new RuntimeException("Accessory not found"));
    }
}
