package com.example.app.model;

<<<<<<< Updated upstream
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@RequiredArgsConstructor
public class Product {
    private int productId;
    @NonNull
    private Store store;
    @NonNull
    private int productIdInStore;
    @NonNull
    private BigDecimal price;
=======
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {


    private String name;
    @Id
    @Column(name = "our_id")
    private Integer ourId;

    @OneToMany(mappedBy = "product")
    private List<AllProduct> allProducts;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOurId() {
        return ourId;
    }

    public void setOurId(Integer ourId) {
        this.ourId = ourId;
    }

    public List<AllProduct> getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(List<AllProduct> allProducts) {
        this.allProducts = allProducts;
    }
>>>>>>> Stashed changes
}
