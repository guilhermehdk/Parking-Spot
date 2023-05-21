package com.api.parkingcontrol.domain.validator;

import com.api.parkingcontrol.dtos.request.ParkingSpotRequest;
import com.api.parkingcontrol.dtos.request.ParkingSpotUpdateRequest;
import com.api.parkingcontrol.infra.exception.ParkingSpotValidatorException;
import com.api.parkingcontrol.respositories.ParkingSpotRepository;
import com.api.parkingcontrol.service.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidatorExistsByApartmentAndBlock implements ParkingSpotValidator {

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    public void validate(ParkingSpotRequest parkingSpotRequest) {
        if (parkingSpotRepository.existsByApartmentAndBlock(parkingSpotRequest.getApartment(), parkingSpotRequest.getBlock())) {
            throw new ParkingSpotValidatorException("Conflict: Parking Spot already registered for this apartment/block!");
        }
    }

    @Override
    public void validate(ParkingSpotUpdateRequest parkingSpotUpdateRequest) {
        if (parkingSpotRepository.existsByApartmentAndBlock(parkingSpotUpdateRequest.getApartment(), parkingSpotUpdateRequest.getBlock())) {
            throw new ParkingSpotValidatorException("Conflict: Parking Spot already registered for this apartment/block!");
        }
    }
}
