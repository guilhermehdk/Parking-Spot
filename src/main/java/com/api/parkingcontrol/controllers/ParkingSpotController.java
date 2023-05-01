package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.domain.ParkingSpotModel;
import com.api.parkingcontrol.dtos.request.ParkingSpotRequest;
import com.api.parkingcontrol.dtos.request.ParkingSpotUpdateRequest;
import com.api.parkingcontrol.dtos.response.ParkingSpotResponse;
import com.api.parkingcontrol.service.ParkingSpotService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.UUID;

@RestController
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    @Autowired
    private ParkingSpotService parkingSpotService;

    @PostMapping
    @Transactional
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotRequest parkingSpotRequest, UriComponentsBuilder uriComponentsBuilder) {
        var parkingSpotModel = parkingSpotService.save(parkingSpotRequest);
        var uri = uriComponentsBuilder.path("/{id}").buildAndExpand(parkingSpotModel.getId()).toUri();

        return ResponseEntity.created(uri).body(new ParkingSpotResponse(parkingSpotModel));
    }

    @GetMapping
    public ResponseEntity<Page<ParkingSpotModel>> getAllParkingSpots(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC)
                                                                     Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findParkingSpot(@PathVariable(value = "id") UUID id) {
        var parkingSpotModel = parkingSpotService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(new ParkingSpotResponse(parkingSpotModel));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Object> deleteParkingSpot(@PathVariable(value = "id") UUID id) {
        var parkingSpotModel = parkingSpotService.findById(id);
        parkingSpotService.delete(parkingSpotModel);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Object> updateParkingSpot(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid ParkingSpotUpdateRequest parkingSpotUpdateRequest) {
        var parkingSpotModel = parkingSpotService.update(id, parkingSpotUpdateRequest);
        return ResponseEntity.status(HttpStatus.OK).body(new ParkingSpotResponse(parkingSpotModel));
    }

}
