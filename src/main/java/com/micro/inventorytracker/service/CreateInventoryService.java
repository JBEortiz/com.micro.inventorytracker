package com.micro.inventorytracker.service;

import com.micro.inventorytracker.dto.InventoryDTO;
import com.micro.inventorytracker.dto.ItemDTO;

public interface CreateInventoryService {
    InventoryDTO created(InventoryDTO inventoryDTO);
}
