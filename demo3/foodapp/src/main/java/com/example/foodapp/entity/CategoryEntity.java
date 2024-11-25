package com.example.foodapp.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Category")
public class CategoryEntity implements Serializable {
@Id
@GeneratedValue(strategy =GenerationType. IDENTITY)
private Long id;
@Column(columnDefinition ="nvarchar(255)")
private String categoryName;
@Column(columnDefinition = "nvarchar(255)")
private String categoryThumb;
@Column(columnDefinition = "nvarchar(MAX)")
private String categoryDescription;
}
