package com.micro.inventorytracker.dto;

import com.micro.inventorytracker.entity.Inventory;
import com.micro.inventorytracker.enums.ItemRarity;
import com.micro.inventorytracker.enums.WeaponType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDTO {
    private Long itemId ;
    private String name;
    private String description;
    private ItemRarity itemRarity;
    private WeaponType weaponType;
    private InventoryDTO inventoryDto;
}
