package com.micro.inventorytracker.controller;

import com.micro.inventorytracker.dto.InventoryDTO;
import com.micro.inventorytracker.service.GetByIdInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("inventory")
public class GetByIdIventoryController {
    private final GetByIdInventoryService getByIdInventoryService;

    @GetMapping("/{id}")
    public ResponseEntity<InventoryDTO> getByIdInventory(@PathVariable String id) {
        return new ResponseEntity<>(getByIdInventoryService.getById(id), HttpStatus.OK);
    }
}
