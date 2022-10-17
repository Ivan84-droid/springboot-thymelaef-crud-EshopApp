package com.example.springbootthymelaefcrudEshopApp.controller;

import com.example.springbootthymelaefcrudEshopApp.service.OrderService;
import com.example.springbootthymelaefcrudEshopApp.service.TshirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TshirtController {
    @Autowired
    private TshirtService tshirtService;
    @Autowired
    private OrderService orderService;
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listOrders", orderService.getAllOrders());
        return "index";
    }
}
