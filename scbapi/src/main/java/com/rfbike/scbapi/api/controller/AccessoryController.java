package com.rfbike.scbapi.api.controller;

import com.rfbike.scbapi.model.entity.Accessory;
import com.rfbike.scbapi.service.AccessoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/accessories")
@RequiredArgsConstructor
public class AccessoryController {

    private final AccessoryService service;

    @GetMapping()
    public ResponseEntity get() {
        List<Accessory> accessoryList = service.getAccessories();
        return ResponseEntity.ok(accessoryList);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Accessory> accessory = service.getAccessoryById(id);
        return ResponseEntity.ok(accessory);
    }
}
