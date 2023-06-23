package com.micro.inventorytracker.service;

import com.micro.inventorytracker.dto.ItemDTO;

public interface CreateItemService {
    ItemDTO created(ItemDTO itemDTO);
}
