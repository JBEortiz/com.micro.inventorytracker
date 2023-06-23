package com.micro.inventorytracker.service.impl;

import com.micro.inventorytracker.dto.InventoryDTO;
import com.micro.inventorytracker.mapper.InventoryMapper;
import com.micro.inventorytracker.repository.InventoryRepository;
import com.micro.inventorytracker.service.GetByIdInventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log
@RequiredArgsConstructor
@Service
public class GetByIdIventoryServiceImpl implements GetByIdInventoryService {
    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;

    @Override
    public InventoryDTO getById(String idInventory) {
        return inventoryMapper.toDto(
                inventoryRepository.getReferenceById(
                        UUID.fromString(idInventory)));
    }
}
