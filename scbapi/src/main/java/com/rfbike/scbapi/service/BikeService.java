package com.rfbike.scbapi.service;

import com.rfbike.scbapi.model.entity.Bike;
import com.rfbike.scbapi.model.repository.BikeRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class BikeService {

    private BikeRepository repository;

    public BikeService(BikeRepository repository) {
        this.repository = repository;
    }

    public List<Bike> getBikes() {
        return repository.findAll();
    }

    public Optional<Bike> getBikeById(Long id) {
        return repository.findById(id);
    }
}
