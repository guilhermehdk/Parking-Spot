package com.api.parkingcontrol.dtos.request;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotUpdateRequest {
    private String parkingSpotNumber;
    @Pattern(regexp = "^[a-zA-Z]{3}\\d{4}$", message = "This field must have 3 letters followed by 4 digits")
    private String licensePlateCar;
    private String brandCar;
    private String modelCar;
    private String colorCar;
    private String responsibleName;
    private String apartment;
    private String block;
}
