package com.rfbike.scbapi.api.dto;

import com.rfbike.scbapi.model.entity.AccessoryType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccessoryTypeDTO {
    private Long id;
    private String type;

    public static AccessoryTypeDTO create(AccessoryType accessoryType) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(accessoryType, AccessoryTypeDTO.class);
    }

}
