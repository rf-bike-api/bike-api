package com.rfbike.scbapi.service;

import com.rfbike.scbapi.model.entity.Address;
import com.rfbike.scbapi.model.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private AddressRepository repository;

    public AddressService (AddressRepository repository){
        this.repository = repository;
    }

    public List<Address> getAddresses() {
        return repository.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return repository.findById(id);
    }

}
