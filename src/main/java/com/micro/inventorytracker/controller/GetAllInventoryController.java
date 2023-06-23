package com.micro.inventorytracker.controller;

import com.micro.inventorytracker.dto.InventoryDTO;
import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.service.GetAllInventoryService;
import com.micro.inventorytracker.service.GetAllItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("inventory")
public class GetAllInventoryController {
    private final GetAllInventoryService getAllInventoryService;

    @PostMapping("/inventories")
    public ResponseEntity<List<InventoryDTO>> getAll() {
        return new ResponseEntity<>(getAllInventoryService.getAll(), HttpStatus.OK);
    }
}
