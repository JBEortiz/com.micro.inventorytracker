package com.micro.inventorytracker.mapper;

import com.micro.inventorytracker.dto.ItemDTO;
import com.micro.inventorytracker.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface ItemMapper {
    @Mapping(target = "itemId", ignore = true)
    Item toEntity(ItemDTO dto);
    ItemDTO toDto(Item entity);
    List<Item> toEntityList(List<ItemDTO> dto);
    List<ItemDTO> toDtoList(List<Item> entity);

}
