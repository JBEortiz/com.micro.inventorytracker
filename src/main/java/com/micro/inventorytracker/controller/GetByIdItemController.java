package com.micro.inventorytracker.controller;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.service.CreateItemService;
import com.micro.inventorytracker.service.GetByIdItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("item")
public class GetByIdItemController {
    private final GetByIdItemService getByIdItemService;

    @GetMapping("/getById/{id}")
    public ResponseEntity<ItemDTO> getByIdItem(@PathVariable Long id) {
        return new ResponseEntity<>(getByIdItemService.getById(id), HttpStatus.OK);
    }
}
