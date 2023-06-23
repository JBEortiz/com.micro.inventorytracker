package com.micro.inventorytracker.controller;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.service.CreateItemService;
import com.micro.inventorytracker.service.GetAllItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("Item")
public class GetAlliItemController {
    private final GetAllItemService getAllItemService;

    @PostMapping("/items")
    public ResponseEntity<List<ItemDTO>> getAll() {
        return new ResponseEntity<>(getAllItemService.getAll(), HttpStatus.OK);
    }
}
