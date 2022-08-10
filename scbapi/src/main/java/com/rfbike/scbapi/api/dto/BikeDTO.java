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
    private Long idSuspensionType;
    private String typeSuspensionType;
    //private List<Accessory> accessoryList = new ArrayList<>();

    public static BikeDTO create(Bike bike) {
        ModelMapper modelMapper = new ModelMapper();
        BikeDTO dto = modelMapper.map(bike, BikeDTO.class);
        assert dto.getIdSuspensionType().equals(bike.getSuspensionType().getId());
        assert dto.getTypeSuspensionType().equals(bike.getSuspensionType().getType());
        return dto;
    }
}
