package com.api.parkingcontrol.domain.validator;

import com.api.parkingcontrol.dtos.request.ParkingSpotRequest;
import com.api.parkingcontrol.dtos.request.ParkingSpotUpdateRequest;
import com.api.parkingcontrol.infra.exception.ParkingSpotValidatorException;
import com.api.parkingcontrol.respositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExistsByLicensePlateCarValidator implements ParkingSpotValidator {

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    public void validate(ParkingSpotRequest parkingSpotRequest) {
        if (parkingSpotRepository.existsByLicensePlateCar(parkingSpotRequest.getLicensePlateCar())) {
            throw new ParkingSpotValidatorException("Conflict: Licence Plate Car is already in use!");
        }
    }

    @Override
    public void validate(ParkingSpotUpdateRequest parkingSpotUpdateRequest) {
        if (parkingSpotRepository.existsByLicensePlateCar(parkingSpotUpdateRequest.getLicensePlateCar())) {
            throw new ParkingSpotValidatorException("Conflict: Licence Plate Car is already in use!");
        }
    }
}
