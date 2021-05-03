package com.ramninder.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramninder.springcloud.models.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
	
	public Product findById(long id);

}
