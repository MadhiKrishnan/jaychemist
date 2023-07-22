package com.ecommerce.jaychemist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCategory {

    @Id
    @GeneratedValue
    private Long productCategoryId;
    private String productCategoryName;

    public ProductCategory(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }
}
