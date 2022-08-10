package com.rfbike.scbapi.api.dto;

import com.rfbike.scbapi.model.entity.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private Long id;
    private String name;
    //private Address address;
    //private List<Cart> cartList = new ArrayList<>();

    public static ClientDTO create(Client client) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(client, ClientDTO.class);
    }

}
