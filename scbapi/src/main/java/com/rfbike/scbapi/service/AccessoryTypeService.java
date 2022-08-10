package com.rfbike.scbapi.service;

import com.rfbike.scbapi.api.dto.AccessoryTypeDTO;
import com.rfbike.scbapi.model.entity.AccessoryType;
import com.rfbike.scbapi.model.repository.AccessoryTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccessoryTypeService {

    private AccessoryTypeRepository repository;

    public AccessoryTypeService(AccessoryTypeRepository repository){
        this.repository = repository;
    }

    public List<AccessoryTypeDTO> getAccessoryTypes() {
        List<AccessoryTypeDTO> list = repository.findAll().stream().map(AccessoryTypeDTO::create).collect(Collectors.toList());
        return list;
    }

    public AccessoryTypeDTO getAccessoryTypeById(Long id) {
        Optional<AccessoryType> accessoryType = repository.findById(id);
        return accessoryType.map(AccessoryTypeDTO::create).orElseThrow(() -> new RuntimeException("Accessory type not found"));
    }

}
