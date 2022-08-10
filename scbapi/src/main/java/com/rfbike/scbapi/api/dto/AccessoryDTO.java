package com.rfbike.scbapi.api.dto;

import com.rfbike.scbapi.model.entity.Accessory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import  org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessoryDTO {
    private Long id;
    private String name;
    private Long idAccessoryType;
    private String typeAccessoryType;

    public static AccessoryDTO create(Accessory accessory) {
        ModelMapper modelMapper = new ModelMapper();
        AccessoryDTO dto = modelMapper.map(accessory, AccessoryDTO.class);
        assert dto.getIdAccessoryType().equals(accessory.getAccessoryType().getId());
        assert dto.getTypeAccessoryType().equals(accessory.getAccessoryType().getType());
        return dto;
    }
}
