package com.micro.inventorytracker.service.impl;

import com.micro.inventorytracker.dto.InventoryDTO;
import com.micro.inventorytracker.mapper.InventoryMapper;
import com.micro.inventorytracker.repository.InventoryRepository;
import com.micro.inventorytracker.service.CreateInventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@RequiredArgsConstructor
@Service
public class CreateInventoryServiceImpl implements CreateInventoryService {
    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;

    @Override
    public InventoryDTO created(InventoryDTO inventoryDTO) {
        return null;
    }
}
