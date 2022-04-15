package com.shree.microbrewery.web.services;

import com.shree.microbrewery.web.model.CostumerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface CostumerService {
    CostumerDto getCustomerById(UUID id);

    CostumerDto saveNewCostumer(CostumerDto costumerDto);

    void updateCostumer(UUID customerId, CostumerDto costumerDto);

    void deleteById(UUID costumerId);
}
