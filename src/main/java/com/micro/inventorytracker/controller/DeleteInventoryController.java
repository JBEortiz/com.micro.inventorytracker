package com.micro.inventorytracker.controller;

import com.micro.inventorytracker.service.DeleteInventoryService;
import com.micro.inventorytracker.service.DeleteItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("inventory")
public class DeleteInventoryController {

    private final DeleteInventoryService deleteInventoryService;

    @PostMapping("/delete")
    public void deleteItem(@PathVariable String id) {
        deleteInventoryService.deleteId(id);
    }
}
