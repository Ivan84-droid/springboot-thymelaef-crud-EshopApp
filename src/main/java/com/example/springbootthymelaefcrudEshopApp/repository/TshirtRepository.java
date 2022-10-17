package com.example.springbootthymelaefcrudEshopApp.repository;

import com.example.springbootthymelaefcrudEshopApp.model.Tshirt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TshirtRepository extends JpaRepository <Tshirt, Long> {
}
