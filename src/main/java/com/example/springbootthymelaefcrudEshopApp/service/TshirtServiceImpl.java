package com.example.springbootthymelaefcrudEshopApp.service;

import com.example.springbootthymelaefcrudEshopApp.model.Tshirt;
import com.example.springbootthymelaefcrudEshopApp.repository.TshirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TshirtServiceImpl implements TshirtService{
    @Autowired
    private TshirtRepository tshirtRepository;
    @Override
    public List<Tshirt> getAllTshirts() {
        return tshirtRepository.findAll();
    }
}
