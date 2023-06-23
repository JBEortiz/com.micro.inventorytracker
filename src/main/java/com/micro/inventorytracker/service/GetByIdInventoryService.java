package com.micro.inventorytracker.service;

import com.micro.inventorytracker.dto.InventoryDTO;

public interface GetByIdInventoryService {
    InventoryDTO getById(Long idInventory);
}
