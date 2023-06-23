package com.micro.inventorytracker.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InventoryDTO {
    private String uuid;
    private String idPerson;
    private List<ItemDTO> items;
}
