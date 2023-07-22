package com.ecommerce.jaychemist.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue
    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    @Lob
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "productCategoryId")
    private ProductCategory productCategory;

    public Product(String productName, BigDecimal productPrice, String imageUrl, ProductCategory productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.imageUrl = imageUrl;
        this.productCategory = productCategory;
    }
}
