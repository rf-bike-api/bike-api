package com.rfbike.scbapi.api.controller;

import com.rfbike.scbapi.model.entity.Address;
import com.rfbike.scbapi.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService service;

    @GetMapping()
    public ResponseEntity get() {
        List<Address> addressList = service.getAddresses();
        return ResponseEntity.ok(addressList);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        Optional<Address> address = service.getAddressById(id);
        return ResponseEntity.ok(address);
    }

}
