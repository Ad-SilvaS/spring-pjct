package com.project.spbt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.spbt.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
