package com.micro.inventorytracker.service.impl;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.entity.Item;
import com.micro.inventorytracker.mapper.ItemMapper;
import com.micro.inventorytracker.repository.ItemRepository;
import com.micro.inventorytracker.service.GetByIdItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log
@RequiredArgsConstructor
@Service
public class GetByIdItemServiceImpl implements GetByIdItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public ItemDTO getById(String idItem) {
        return itemMapper.toDto(
                itemRepository.getReferenceById(
                        UUID.fromString(idItem)));
    }

}
