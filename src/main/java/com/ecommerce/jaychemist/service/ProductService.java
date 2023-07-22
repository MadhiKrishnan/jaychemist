package com.ecommerce.jaychemist.service;

import com.ecommerce.jaychemist.entity.Product;
import com.ecommerce.jaychemist.repository.ProductCategoryRepo;
import com.ecommerce.jaychemist.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepo productRepo;
    private ProductCategoryRepo productCategoryRepo;

    public void createProduct(){
        List<Product> products = new ArrayList<>();

        products.add(new Product("Biotin Hair Gummies ", BigDecimal.valueOf(499.00),"https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcTt2iizfTPAb1iR3h7nLl-atvjSlvuY7Gd22LIeHE8eYQGVZcIrIRuGytHA_6qOKcKKNuddgypf9r9GCo2brVxYY0GJaxg1en4wQeArCc9hmteUXtGjUKyc&usqp=CAc",productCategoryRepo.findByProductCategoryName("Multi vitamin tablets")));
        products.add(new Product("GNC - Pill - Mega Men Sport ", BigDecimal.valueOf(799.00),"https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcTseEfOzonenxWse9IXdwfnhzSCaJ9JJIr7Tr3tQzHpVxQmrJTpUe20Ro9FzljOoHgvx4MwMYsQCflJWOPQcGS8Apvh_SJthQ&usqp=CAc",productCategoryRepo.findByProductCategoryName("Multi vitamin tablets")));
        products.add(new Product("HK Vitals Multivitamin by HealthKart", BigDecimal.valueOf(499.00),"https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcT_UQjs6MEWWpDM-dk9BKpLw01hzJirqkTicrCoCwJVCSBlFOxp07sdLhUBNZ2bSnwcqzxHzHLLjS8vBohqN9YququuDL7kghUs0Yt6-opUTnp7PeV2dWeAIg&usqp=CAc",productCategoryRepo.findByProductCategoryName("Multi vitamin tablets")));
        products.add(new Product("TrueBasics Multivit Men, 90 tablet(s) ", BigDecimal.valueOf(499.00),"https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcSA_1RjgxJB2YKcv0cr12-n8RXslxCHmNPjM93aFAJwo9HHn-c8s1-GRBfKyl5qR_A_H9iyFeklNJW31ffhYW_KzqkWFzSlEjn6v6fkKQRrDN6bCEcaUihw&usqp=CAc",productCategoryRepo.findByProductCategoryName("Multi vitamin tablets")));

        productRepo.saveAll(products);
    }
}
