package com.example.foodapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodapp.entity.CategoryEntity;
import com.example.foodapp.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repo;

	public List<CategoryEntity> listAll() {
		return repo.findAll();
	}

	public CategoryEntity save(CategoryEntity product) {
		return repo.save(product);
	}

	public CategoryEntity get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}
