package com.micro.inventorytracker.service.impl;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.mapper.ItemMapper;
import com.micro.inventorytracker.repository.ItemRepository;
import com.micro.inventorytracker.service.GetAllItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;
@Log
@RequiredArgsConstructor
@Service
public class GetAllItemServiceImpl implements GetAllItemService {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;
    @Override
    public List<ItemDTO> getAll() {
        return itemMapper.toDtoList(
                itemRepository.findAll());
    }
}
