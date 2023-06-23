package com.micro.inventorytracker.controller;

import com.micro.inventorytracker.dto.InventoryDTO;
import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.service.CreateInventoryService;
import com.micro.inventorytracker.service.GetByIdInventoryService;
import com.micro.inventorytracker.service.GetByIdItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("inventory")
public class CreateInventoryController {

    private final CreateInventoryService createInventoryService;

    @PostMapping("/create")
    public ResponseEntity<InventoryDTO> createInventory(@RequestBody InventoryDTO dto) {
        return new ResponseEntity<>(createInventoryService.created(dto), HttpStatus.OK);
    }
}
