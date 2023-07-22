package com.ecommerce.jaychemist.repository;

import com.ecommerce.jaychemist.entity.Product;
import com.ecommerce.jaychemist.entity.ProductCategory;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Locale;

public interface ProductRepo extends JpaRepository<Product,Long> {
    List<Product> findByProductCategory(ProductCategory productCategory);
}
