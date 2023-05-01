package com.api.parkingcontrol.dtos.response;

import com.api.parkingcontrol.models.ParkingSpotModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotResponse {

    private UUID id;
    private String parkingSpotNumber;
    private String licensePlateCar;
    private String brandCar;
    private String modelCar;
    private String colorCar;
    private String responsibleName;
    private String apartment;
    private String block;

    public ParkingSpotResponse(ParkingSpotModel parkingSpotModel) {
        this(
                parkingSpotModel.getId(),
                parkingSpotModel.getParkingSpotNumber(),
                parkingSpotModel.getLicensePlateCar(),
                parkingSpotModel.getBrandCar(),
                parkingSpotModel.getModelCar(),
                parkingSpotModel.getColorCar(),
                parkingSpotModel.getResponsibleName(),
                parkingSpotModel.getApartment(),
                parkingSpotModel.getBlock()
        );
    }
}
