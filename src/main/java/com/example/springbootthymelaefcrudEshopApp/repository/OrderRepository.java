package com.example.springbootthymelaefcrudEshopApp.repository;

import com.example.springbootthymelaefcrudEshopApp.model.Order;
import com.example.springbootthymelaefcrudEshopApp.model.Tshirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    }
