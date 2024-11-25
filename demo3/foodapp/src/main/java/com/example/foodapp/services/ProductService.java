package com.example.foodapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodapp.entity.ProductEntity;
import com.example.foodapp.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;

	public List<ProductEntity> listAll() {
		return repo.findAll();
	}

	public ProductEntity save(ProductEntity product) {
		return repo.save(product);
	}

	public ProductEntity get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}
