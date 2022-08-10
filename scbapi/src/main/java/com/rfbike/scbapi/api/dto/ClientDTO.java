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

    private Long idAddress;
    private String postCodeAddress;
    private String stateAddress;
    private String cityAddress;
    private String neighborhoodAddress;
    private String streetAddress;
    private String numberAddress;

    //private List<Cart> cartList = new ArrayList<>();

    public static ClientDTO create(Client client) {
        ModelMapper modelMapper = new ModelMapper();
        ClientDTO dto = modelMapper.map(client, ClientDTO.class);
        assert dto.getIdAddress().equals(client.getAddress().getId());
        assert dto.getPostCodeAddress().equals(client.getAddress().getPostCode());
        assert dto.getStateAddress().equals(client.getAddress().getState());
        assert dto.getCityAddress().equals(client.getAddress().getCity());
        assert dto.getNeighborhoodAddress().equals(client.getAddress().getNeighborhood());
        assert dto.getStreetAddress().equals(client.getAddress().getStreet());
        assert dto.getNumberAddress().equals(client.getAddress().getNumber());
        return dto;
    }

    /*
    public static AccessoryDTO create(Accessory accessory) {
        ModelMapper modelMapper = new ModelMapper();
        AccessoryDTO dto = modelMapper.map(accessory, AccessoryDTO.class);
        assert dto.getIdAccessoryType().equals(accessory.getAccessoryType().getId());
        assert dto.getTypeAccessoryType().equals(accessory.getAccessoryType().getType());
        return dto;
    }
     */

}
