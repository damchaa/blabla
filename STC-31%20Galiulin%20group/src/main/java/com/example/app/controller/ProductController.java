package com.example.app.controller;

import com.example.app.model.Product;
import com.example.app.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductRepo productRepo;
    @GetMapping("/product")
    public String product(Model model){
        List<Product> products = productRepo.findAll();
        model.addAttribute("products",products);
        return "products";
    }
}
