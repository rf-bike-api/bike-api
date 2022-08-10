package com.rfbike.scbapi.api.controller;

import com.rfbike.scbapi.model.entity.SuspensionType;
import com.rfbike.scbapi.service.SuspensionTypeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/suspensionTypes")
@AllArgsConstructor
public class SuspensionTypeController {

    private final SuspensionTypeService service;

    @GetMapping()
    public ResponseEntity get() {
        List<SuspensionType> suspensionTypeList = service.getSuspensionTypes();
        return ResponseEntity.ok(suspensionTypeList);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        Optional<SuspensionType> suspensionType = service.getSuspensionTypeById(id);
        return ResponseEntity.ok(suspensionType);
    }
}
