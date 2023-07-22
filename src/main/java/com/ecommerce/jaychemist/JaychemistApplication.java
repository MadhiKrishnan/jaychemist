package com.ecommerce.jaychemist;

import com.ecommerce.jaychemist.repository.PartyRepository;
import com.ecommerce.jaychemist.repository.ProductCategoryRepo;
import com.ecommerce.jaychemist.repository.ProductRepo;
import com.ecommerce.jaychemist.service.ProductCategoryService;
import com.ecommerce.jaychemist.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Slf4j
public class JaychemistApplication {

	@Autowired
	private ProductCategoryService productCategoryService;
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(JaychemistApplication.class, args);
	}

	@Component
	public class MyCommandLineRunner implements CommandLineRunner {

		@Override
		public void run(String... args) throws Exception {
			productCategoryService.createCategory();
			productService.createProduct();
		}
	}
}
