package com.example.app.model;

import javax.persistence.*;

@Entity
@Table(name = "allproduct")
public class AllProduct {
    @Id
    private Integer id;
    private String name;
    private String description;
    private String shop;
    private String price;



    @ManyToOne
    @JoinColumn(name = "out_id")
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "AllProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", shop='" + shop + '\'' +
                ", product=" + product +
                '}';
    }
}
