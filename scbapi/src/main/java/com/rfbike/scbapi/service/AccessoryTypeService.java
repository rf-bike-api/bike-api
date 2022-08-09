package com.rfbike.scbapi.service;

import com.rfbike.scbapi.model.entity.Accessory;
import com.rfbike.scbapi.model.entity.AccessoryType;
import com.rfbike.scbapi.model.repository.AccessoryTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccessoryTypeService {

    private AccessoryTypeRepository repository;

    public AccessoryTypeService(AccessoryTypeRepository repository){
        this.repository = repository;
    }

    public List<AccessoryType> getAccessoryTypes() {
        return repository.findAll();
    }

    public Optional<AccessoryType> getAccessoryTypeById(Long id) {
        return repository.findById(id);
    }
}
