package com.api.parkingcontrol.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotRequest {

    @NotBlank(message = "Field cannot be null")
    private String parkingSpotNumber;
    @NotBlank(message = "Field cannot be null")
    @Pattern(regexp = "^[a-zA-Z]{3}\\d{4}$", message = "This field must have 3 letters followed by 4 digits")
    private String licensePlateCar;
    @NotBlank(message = "Field cannot be null")
    private String brandCar;
    @NotBlank(message = "Field cannot be null")
    private String modelCar;
    @NotBlank(message = "Field cannot be null")
    private String colorCar;
    @NotBlank(message = "Field cannot be null")
    private String responsibleName;
    @NotBlank(message = "Field cannot be null")
    private String apartment;
    @NotBlank(message = "Field cannot be null")
    private String block;
}
