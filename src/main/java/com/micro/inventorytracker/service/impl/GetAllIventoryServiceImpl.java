package com.micro.inventorytracker.service.impl;

import com.micro.inventorytracker.dto.InventoryDTO;
import com.micro.inventorytracker.mapper.InventoryMapper;
import com.micro.inventorytracker.repository.InventoryRepository;
import com.micro.inventorytracker.service.GetAllInventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@RequiredArgsConstructor
@Service
public class GetAllIventoryServiceImpl implements GetAllInventoryService {
    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;

    @Override
    public List<InventoryDTO> getAll() {
        return inventoryMapper.toDtoList(
                inventoryRepository.findAll());
    }
}
