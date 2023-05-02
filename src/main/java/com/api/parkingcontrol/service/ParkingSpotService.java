package com.api.parkingcontrol.service;

import com.api.parkingcontrol.domain.ParkingSpotModel;
import com.api.parkingcontrol.domain.validator.ParkingSpotValidator;
import com.api.parkingcontrol.dtos.request.ParkingSpotRequest;
import com.api.parkingcontrol.dtos.request.ParkingSpotUpdateRequest;
import com.api.parkingcontrol.dtos.response.ParkingSpotResponse;
import com.api.parkingcontrol.respositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;

@Service
public class ParkingSpotService {

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    @Autowired
    private List<ParkingSpotValidator> parkingSpotValidators;

    @Transactional
    public ParkingSpotResponse save(ParkingSpotRequest parkingSpotRequest) {

        parkingSpotValidators.forEach(validator -> validator.validate(parkingSpotRequest));

        var parkingSpotModel = new ParkingSpotModel(parkingSpotRequest, LocalDateTime.now(ZoneId.of("UTC")));
        parkingSpotRepository.save(parkingSpotModel);
        return new ParkingSpotResponse(parkingSpotModel);
    }

    public Page<ParkingSpotResponse> findAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable).map(ParkingSpotResponse::new);
    }

    public ParkingSpotModel findById(UUID id) {
        return parkingSpotRepository.findById(id).get();
    }

    public ParkingSpotResponse findParkingSpotById(UUID id) {
        var parkingSpotModel = findById(id);
        return new ParkingSpotResponse(parkingSpotModel);
    }

    @Transactional
    public ParkingSpotResponse update(UUID id, ParkingSpotUpdateRequest parkingSpotUpdateRequest) {
//        TODO: Validação de regras de negócios para update
//        var parkingSpotRequest = new ParkingSpotRequest();
//        BeanUtils.copyProperties(parkingSpotUpdateRequest,parkingSpotRequest);
//        parkingSpotValidators.forEach(validator -> validator.validate(parkingSpotRequest));

        var parkingSpotModel = findById(id);
        parkingSpotModel.updateParkingSpot(parkingSpotUpdateRequest);
        return new ParkingSpotResponse(parkingSpotModel);
    }

    @Transactional
    public void deleteById(UUID id) {
        var parkingSpotModel = findById(id);
        parkingSpotRepository.delete(parkingSpotModel);
    }
}
