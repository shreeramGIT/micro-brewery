package com.shree.microbrewery.web.services;

import com.shree.microbrewery.web.model.CostumerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CostumerServiceImpl implements CostumerService {
    @Override
    public CostumerDto getCustomerById(UUID id) {
        return CostumerDto.builder()
                .id(UUID.randomUUID())
                .name("Shreeram")
                .build();
    }

    @Override
    public CostumerDto saveNewCostumer(CostumerDto costumerDto) {
        return CostumerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCostumer(UUID customerId, CostumerDto costumerDto) {
        //TODO - Implement
    }

    @Override
    public void deleteById(UUID costumerId) {
        log.debug("Deleting a costumer");
    }

}
