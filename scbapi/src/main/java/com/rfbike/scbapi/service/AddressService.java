package com.rfbike.scbapi.service;

import com.rfbike.scbapi.api.dto.AddressDTO;
import com.rfbike.scbapi.model.entity.Address;
import com.rfbike.scbapi.model.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService {

    private AddressRepository repository;

    public AddressService (AddressRepository repository){
        this.repository = repository;
    }

    public List<AddressDTO> getAddresses() {
        List<AddressDTO> list = repository.findAll().stream().map(AddressDTO::create).collect(Collectors.toList());
        return list;
    }

    public AddressDTO getAddressById(Long id) {
        Optional<Address> address = repository.findById(id);
        return address.map(AddressDTO::create).orElseThrow(() -> new RuntimeException("Address not found"));
    }

}
