package com.example.foodapp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy =GenerationType. IDENTITY)
	private Long id;
	private String username;
	@Email
	private String email;
	@Column(length = 60, columnDefinition = "nvarchar(50) not null")
	private String name;
	private String password;
	private boolean enabled;
//	@OneToMany (mappedBy "users", cascade CascadeType. ALL, fetch *FetchType. EAGER) private Set<UserRoleäntity> roles new HashSet<>();
	@ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
	@JoinTable( 
	name = "users_roles", joinColumns = @JoinColumn(name ="user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id")
	)
	private Set<RoleEntity> roles= new HashSet<>();
}
