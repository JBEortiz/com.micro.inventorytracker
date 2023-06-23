package com.micro.inventorytracker.controller;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.service.CreateItemService;
import com.micro.inventorytracker.service.DeleteItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("item")
public class DeleteItemController {
    private final DeleteItemService deleteItemService;

    @PostMapping("/delete")
    public void deleteItem(@PathVariable Long id) {
       deleteItemService.deleteId(id);
    }
}
