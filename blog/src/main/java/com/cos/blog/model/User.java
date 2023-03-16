package com.cos.blog.model;

import java.sql.Timestamp;

//import java.security.Timestamp;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(nullable=false,length =20)
	private String username;
	
	@Column(nullable=false,length =100)
	private String password;
	
	@Column(nullable=false,length =50)
	private String email;
	
	@ColumnDefault("'user'")
	private String role; 
	
	@CreationTimestamp
	private Timestamp createDate;
}
