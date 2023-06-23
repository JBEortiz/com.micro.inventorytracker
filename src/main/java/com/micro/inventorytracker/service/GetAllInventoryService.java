package com.micro.inventorytracker.service;

import com.micro.inventorytracker.dto.InventoryDTO;
import java.util.List;

public interface GetAllInventoryService {
    List<InventoryDTO> getAll();

}
