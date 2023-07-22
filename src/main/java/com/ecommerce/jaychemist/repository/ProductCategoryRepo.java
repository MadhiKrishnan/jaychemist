package com.ecommerce.jaychemist.repository;

import com.ecommerce.jaychemist.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepo extends JpaRepository<ProductCategory,Long> {
    ProductCategory findByProductCategoryName(String productCategoryName);
}
