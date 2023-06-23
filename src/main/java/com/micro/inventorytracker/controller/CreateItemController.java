package com.micro.inventorytracker.controller;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.service.CreateItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("item")
public class CreateItemController {

    private final CreateItemService createItemService;

    @PostMapping("/create")
    public ResponseEntity<ItemDTO> createItem(@RequestBody ItemDTO dto) {
        return new ResponseEntity<>(createItemService.created(dto), HttpStatus.OK);
    }
}