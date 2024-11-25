package com.example.foodapp.entity;

import java.util.Set;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table (name ="roles")
public class RoleEntity implements Serializable {
@Id
@Column(name ="role_id")
@GeneratedValue(strategy =GenerationType. IDENTITY)
private long id;
@Column(name ="role_name", length =50, columnDefinition ="nvarchar(50) not null")
private String name;
}
