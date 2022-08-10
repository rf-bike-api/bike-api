package com.rfbike.scbapi.api.dto;

import com.rfbike.scbapi.model.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private Long id;
    private String postCode;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String number;

    public static AddressDTO create(Address address) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(address, AddressDTO.class);
    }
}
