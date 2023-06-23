package com.micro.inventorytracker.mapper;

import com.micro.inventorytracker.dto.InventoryDTO;
import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.entity.Inventory;
import com.micro.inventorytracker.entity.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = ItemMapper.class)
public interface InventoryMapper {
    Inventory toEntity(InventoryDTO dto);
    InventoryDTO toDto( Inventory entity);
    List<Inventory> toEntityList(List<InventoryDTO> dto);
    List<InventoryDTO> toDtoList(List<Inventory> entity);
}
