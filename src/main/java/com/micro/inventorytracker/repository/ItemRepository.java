package com.micro.inventorytracker.repository;

import com.micro.inventorytracker.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
}
