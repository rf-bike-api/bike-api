package com.rfbike.scbapi.service;

import com.rfbike.scbapi.api.dto.ClientDTO;
import com.rfbike.scbapi.model.entity.Client;
import com.rfbike.scbapi.model.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

    public ClientRepository repository;

    public ClientService (ClientRepository repository) {
        this.repository = repository;
    }

    public List<ClientDTO> getClients() {
        List<ClientDTO> list = repository.findAll().stream().map(ClientDTO::create).collect(Collectors.toList());
        return list;
    }

    public ClientDTO getClientById(Long id) {
        Optional<Client> client = repository.findById(id);
        return client.map(ClientDTO::create).orElseThrow(() -> new RuntimeException("Client not found"));
    }

}
