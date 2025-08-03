package com.library.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_DETAILS", uniqueConstraints = {@UniqueConstraint(columnNames = "rollNo")})
@Getter
@Setter
@Builder
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String rollNo;
	private String registrationNumber;
	private String firstName;
	private String lastName;
	private String userType;
	private String emailId;
	private String mobileNo;
	private String adharCard;

	
}
