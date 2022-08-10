package com.rfbike.scbapi.service;

import com.rfbike.scbapi.api.dto.BikeDTO;
import com.rfbike.scbapi.model.entity.Bike;
import com.rfbike.scbapi.model.repository.BikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BikeService {

    private BikeRepository repository;

    public BikeService(BikeRepository repository) {
        this.repository = repository;
    }

    public List<BikeDTO> getBikes() {
        List<BikeDTO> list = repository.findAll().stream().map(BikeDTO::create).collect(Collectors.toList());
        return list;
    }

    public BikeDTO getBikeById(Long id) {
        Optional<Bike> bike = repository.findById(id);
        return bike.map(BikeDTO::create).orElseThrow(() -> new RuntimeException("Bike not found"));
    }
}
