package com.rfbike.scbapi.service;

import com.rfbike.scbapi.model.entity.Client;
import com.rfbike.scbapi.model.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    public ClientRepository repository;

    public ClientService (ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> getClients() {
        return repository.findAll();
    }

    public Optional<Client> getClientById(Long id) {
        return repository.findById(id);
    }

}
