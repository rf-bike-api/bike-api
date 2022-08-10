package com.rfbike.scbapi.api.dto;

import com.rfbike.scbapi.model.entity.Bike;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BikeDTO {
    private Long id;
    private String color;
    private double weight;
    //private SuspensionType suspensionType;
    //private List<Accessory> accessoryList = new ArrayList<>();

    public static BikeDTO create(Bike bike) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(bike, BikeDTO.class);
    }
}
