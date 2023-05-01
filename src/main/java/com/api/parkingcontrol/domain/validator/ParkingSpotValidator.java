package com.api.parkingcontrol.domain.validator;

import com.api.parkingcontrol.domain.ParkingSpotModel;
import com.api.parkingcontrol.dtos.request.ParkingSpotRequest;

public interface ParkingSpotValidator {
    void validate(ParkingSpotRequest parkingSpotRequest);
}
