package com.rfbike.scbapi.api.controller;

import com.rfbike.scbapi.model.entity.Client;
import com.rfbike.scbapi.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clients")
@AllArgsConstructor
public class ClientController {

    private final ClientService service;

    @GetMapping()
    public ResponseEntity get() {
        List<Client> clientList = service.getClients();
        return ResponseEntity.ok(clientList);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        Optional<Client> client = service.getClientById(id);
        return ResponseEntity.ok(client);
    }
}
