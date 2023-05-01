package com.api.parkingcontrol.infra.exception;

public class ParkingSpotValidatorException extends RuntimeException {
    public ParkingSpotValidatorException(String message) {
        super(message);
    }
}
