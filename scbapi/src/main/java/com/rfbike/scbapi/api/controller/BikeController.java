package com.rfbike.scbapi.api.controller;

import com.rfbike.scbapi.api.dto.BikeDTO;
import com.rfbike.scbapi.service.BikeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
@AllArgsConstructor
public class BikeController {

    private final BikeService service;

    @GetMapping()
    public ResponseEntity get(){
        List<BikeDTO> bikeList = service.getBikes();
        return ResponseEntity.ok(bikeList);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        BikeDTO bike = service.getBikeById(id);
        return ResponseEntity.ok(bike);
    }

    /*
    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<AccessoryType> accessoryType = service.getAccessoryTypeById(id);
        return ResponseEntity.ok(accessoryType);
    }
     */
}
