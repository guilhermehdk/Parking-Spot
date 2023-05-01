package com.api.parkingcontrol.models;

import com.api.parkingcontrol.dtos.request.ParkingSpotRequest;
import com.api.parkingcontrol.dtos.request.ParkingSpotUpdateRequest;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "parking-spot")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 100)
    private String brandCar;
    @Column(nullable = false, length = 100)
    private String modelCar;
    @Column(nullable = false, length = 100)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 150)
    private String responsibleName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;

    public ParkingSpotModel(ParkingSpotRequest parkingSpotRequest, LocalDateTime localDateTime) {
        this(
                null,
                parkingSpotRequest.getParkingSpotNumber(),
                parkingSpotRequest.getLicensePlateCar(),
                parkingSpotRequest.getBrandCar(),
                parkingSpotRequest.getModelCar(),
                parkingSpotRequest.getColorCar(),
                localDateTime,
                parkingSpotRequest.getResponsibleName(),
                parkingSpotRequest.getApartment(),
                parkingSpotRequest.getBlock()
        );
    }

    public void updateParkingSpot(ParkingSpotUpdateRequest parkingSpotUpdateRequest) {
        if (parkingSpotUpdateRequest.getParkingSpotNumber() != null) {
            setParkingSpotNumber(parkingSpotUpdateRequest.getParkingSpotNumber());
        }
        if (parkingSpotUpdateRequest.getLicensePlateCar() != null) {
            setLicensePlateCar(parkingSpotUpdateRequest.getLicensePlateCar());
        }
        if (parkingSpotUpdateRequest.getBrandCar() != null) {
            setBrandCar(parkingSpotUpdateRequest.getBrandCar());
        }
        if (parkingSpotUpdateRequest.getModelCar() != null) {
            setModelCar(parkingSpotUpdateRequest.getModelCar());
        }
        if (parkingSpotUpdateRequest.getColorCar() != null) {
            setColorCar(parkingSpotUpdateRequest.getColorCar());
        }
        if (parkingSpotUpdateRequest.getResponsibleName() != null) {
            setResponsibleName(parkingSpotUpdateRequest.getResponsibleName());
        }
        if (parkingSpotUpdateRequest.getApartment() != null) {
            setApartment(parkingSpotUpdateRequest.getApartment());
        }
        if (parkingSpotUpdateRequest.getBlock() != null) {
            setBlock(parkingSpotUpdateRequest.getBlock());
        }
    }
}
