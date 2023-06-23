package com.micro.inventorytracker.mapper;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.entity.Item;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ItemMapper {
    Item toEntity(ItemDTO dto);
    ItemDTO toDto(Item entity);
    List<Item> toEntityList(List<ItemDTO> dto);
    List<ItemDTO> toDtoList(List<Item> entity);

}
