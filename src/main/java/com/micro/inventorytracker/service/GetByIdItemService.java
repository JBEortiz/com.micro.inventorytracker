package com.micro.inventorytracker.service;

import com.micro.inventorytracker.dto.ItemDTO;

public interface GetByIdItemService {
    ItemDTO getById(String idItem);
}
