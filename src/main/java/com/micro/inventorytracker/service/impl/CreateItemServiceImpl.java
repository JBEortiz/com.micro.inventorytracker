package com.micro.inventorytracker.service.impl;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.mapper.ItemMapper;
import com.micro.inventorytracker.repository.ItemRepository;
import com.micro.inventorytracker.service.CreateItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Log
@RequiredArgsConstructor
@Service
public class CreateItemServiceImpl implements CreateItemService {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public ItemDTO created(ItemDTO itemDTOCreate) {
        return itemMapper.toDto(
                itemRepository.save(
                        itemMapper.toEntity(itemDTOCreate)));
    }
}
