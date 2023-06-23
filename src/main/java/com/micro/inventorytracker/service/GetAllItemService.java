package com.micro.inventorytracker.service;

import com.micro.inventorytracker.dto.ItemDTO;

import java.util.List;

public interface GetAllItemService {
    List<ItemDTO> getAll();
}
