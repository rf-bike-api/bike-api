package com.rfbike.scbapi.api.controller;

import com.rfbike.scbapi.api.dto.AccessoryTypeDTO;
import com.rfbike.scbapi.service.AccessoryTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accessoryTypes")
@RequiredArgsConstructor
public class AccessoryTypeController {

    private final AccessoryTypeService service;

    @GetMapping()
    public ResponseEntity get() {
        List<AccessoryTypeDTO> accessoryTypeList = service.getAccessoryTypes();
        return ResponseEntity.ok(accessoryTypeList);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        AccessoryTypeDTO accessoryType = service.getAccessoryTypeById(id);
        return ResponseEntity.ok(accessoryType);
    }
}
