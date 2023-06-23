package com.micro.inventorytracker.service.impl;

import com.micro.inventorytracker.mapper.ItemMapper;
import com.micro.inventorytracker.repository.ItemRepository;
import com.micro.inventorytracker.service.DeleteItemService;
import com.micro.inventorytracker.service.GetByIdItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@RequiredArgsConstructor
@Service
public class DeleteItemServiceImpl implements DeleteItemService {
    private final ItemRepository itemRepository;
    private final GetByIdItemService getByIdItemService;
    private final ItemMapper itemMapper;

    @Override
    public void deleteId(Long idItem) {
        itemRepository.delete(
                itemMapper.toEntity(
                        getByIdItemService.getById(idItem)));
    }
}
