package com.example.foodapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.foodapp.entity.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	@Query("SELECT u FROM RoleEntity u WHERE u.name= :name")
	public RoleEntity getUserByName(@Param("name") String name);

	Optional<RoleEntity> findByName(String name);
}
