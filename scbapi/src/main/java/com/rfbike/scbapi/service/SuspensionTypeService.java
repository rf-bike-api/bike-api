package com.rfbike.scbapi.service;

import com.rfbike.scbapi.api.dto.SuspensionTypeDTO;
import com.rfbike.scbapi.model.entity.SuspensionType;
import com.rfbike.scbapi.model.repository.SuspensionTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SuspensionTypeService {

    private SuspensionTypeRepository repository;

    public SuspensionTypeService(SuspensionTypeRepository repository) {
        this.repository = repository;
    }

    public List<SuspensionTypeDTO> getSuspensionTypes() {
        List<SuspensionTypeDTO> list = repository.findAll().stream().map(SuspensionTypeDTO::create).collect(Collectors.toList());
        return list;
    }

    public SuspensionTypeDTO getSuspensionTypeById(Long id) {
        Optional<SuspensionType> suspensionType = repository.findById(id);
        return suspensionType.map(SuspensionTypeDTO::create).orElseThrow(() -> new RuntimeException("Suspension type not found"));
    }
}
