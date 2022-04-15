package com.shree.microbrewery.web.controller;

import com.shree.microbrewery.web.model.CostumerDto;
import com.shree.microbrewery.web.services.CostumerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/costumer")
@RestController
public class CostumerController {
    private final CostumerService costumerService;

    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }
    @GetMapping({"/{costumerId}"})
    public ResponseEntity<CostumerDto> getCostumer(@PathVariable("costumerId") UUID id){
        return new ResponseEntity<>(costumerService.getCustomerById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CostumerDto costumerDto){
        CostumerDto savedDto = costumerService.saveNewCostumer(costumerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/costumer"+savedDto.getId().toString());
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"/{costumerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("costumerId") UUID customerId, @RequestBody CostumerDto costumerDto)
    {
        costumerService.updateCostumer(customerId,costumerDto);
    }

    @DeleteMapping({"/{costumerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  void deleteCostumer(@PathVariable("costumerId") UUID costumerId){
        costumerService.deleteById(costumerId);
    }
}
