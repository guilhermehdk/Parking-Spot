package com.api.parkingcontrol.domain.validator;

import com.api.parkingcontrol.domain.ParkingSpotModel;
import com.api.parkingcontrol.dtos.request.ParkingSpotRequest;
import com.api.parkingcontrol.dtos.request.ParkingSpotUpdateRequest;

public interface ParkingSpotValidator {
    void validate(ParkingSpotRequest parkingSpotRequest);

    void validate(ParkingSpotUpdateRequest parkingSpotUpdateRequest);
}
