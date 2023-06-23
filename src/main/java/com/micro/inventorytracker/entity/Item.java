package com.micro.inventorytracker.entity;
import com.micro.inventorytracker.enums.ItemRarity;
import com.micro.inventorytracker.enums.WeaponType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ITEM")
public class Item {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "idItem", length = 36,unique = true)
    private UUID idItem ;
    private String name;
    private String description;
    private ItemRarity itemRarity;
    private WeaponType  weaponType;

    @ManyToOne
    @JoinColumn(name = "idIventory")
    private Inventory inventory;

}
