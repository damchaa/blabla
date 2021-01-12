package com.example.app.controller;

import com.example.app.model.ProductWindow;
import com.example.app.service.store._5ka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/products")
public class Product5kaController {

    @GetMapping("/promo/5ka")
    public ModelAndView getProductsForPromo() {
        _5ka handler = new _5ka();
        List<ProductWindow> productsForPromo = handler.getProductsForPromo();

        HashMap<String, Object> params = new HashMap<>();
        params.put("products_5ka_for_promo", productsForPromo);

        return new ModelAndView("5ka_products", params);
    }

}