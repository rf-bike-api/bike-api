package com.rfbike.scbapi.service;

import com.rfbike.scbapi.model.entity.SuspensionType;
import com.rfbike.scbapi.model.repository.SuspensionTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuspensionTypeService {

    private SuspensionTypeRepository repository;

    public SuspensionTypeService(SuspensionTypeRepository repository) {
        this.repository = repository;
    }

    public List<SuspensionType> getSuspensionTypes() {
        return repository.findAll();
    }

    public Optional<SuspensionType> getSuspensionTypeById(Long id) {
        return repository.findById(id);
    }
}
