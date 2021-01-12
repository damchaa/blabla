package com.example.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductWindow {
    private int productWindowId;
    private Measure measure;
    private String name;
    private String description;
    private Product product;
}
