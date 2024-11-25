package com.example.foodapp.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuppressWarnings("serial")
@Table(name = "Products")
public class ProductEntity implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	private Long id;
	@Column(columnDefinition = "nvarchar(255)")
	private String name;
	@Column(columnDefinition = "nvarchar(255)")
	private String brand;
	@Column(columnDefinition = "nvarchar(255)")
	private String madein;
	private float price;
}
