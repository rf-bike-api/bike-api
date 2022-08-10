package com.rfbike.scbapi.api.dto;

import com.rfbike.scbapi.model.entity.SuspensionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuspensionTypeDTO {
    private Long id;
    private String type;

    public static SuspensionTypeDTO create(SuspensionType suspensionType) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(suspensionType, SuspensionTypeDTO.class);
    }

}
