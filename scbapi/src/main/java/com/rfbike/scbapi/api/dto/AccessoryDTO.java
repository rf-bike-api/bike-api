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
    //private AccessoryTypeDTO accessoryType;

    public static AccessoryDTO create(Accessory accessory) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(accessory, AccessoryDTO.class);
    }
}
