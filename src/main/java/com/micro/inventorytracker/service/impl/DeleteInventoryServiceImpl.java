package com.micro.inventorytracker.service.impl;

import com.micro.inventorytracker.mapper.InventoryMapper;
import com.micro.inventorytracker.repository.InventoryRepository;
import com.micro.inventorytracker.service.DeleteInventoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@RequiredArgsConstructor
@Service
public class DeleteInventoryServiceImpl implements DeleteInventoryService {
    private final InventoryRepository inventoryRepository;
    private final InventoryMapper inventoryMapper;

    @Override
    public void deleteId(Long idItem) {

    }
}
