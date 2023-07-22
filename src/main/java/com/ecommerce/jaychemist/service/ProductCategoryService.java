package com.ecommerce.jaychemist.service;

import com.ecommerce.jaychemist.entity.ProductCategory;
import com.ecommerce.jaychemist.repository.ProductCategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductCategoryService {
    private ProductCategoryRepo productCategoryRepo;

    public void createCategory(){
        List<ProductCategory> productCategories = new ArrayList<>();
        productCategories.add(new ProductCategory("Hot Offers"));
        productCategories.add(new ProductCategory("Discount Offers"));
        productCategories.add(new ProductCategory("Generic Medications"));
        productCategories.add(new ProductCategory("Multi vitamin tablets"));
        productCategories.add(new ProductCategory("Dibetic Medications"));
        productCategories.add(new ProductCategory("Cipla Medications"));
        productCategories.add(new ProductCategory("General Medications"));

        productCategoryRepo.saveAll(productCategories);
    }
}
