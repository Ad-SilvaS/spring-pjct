package com.project.spbt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spbt.entities.OrderItem;
import com.project.spbt.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
