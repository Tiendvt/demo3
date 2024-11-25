package com.example.foodapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodapp.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{

}
