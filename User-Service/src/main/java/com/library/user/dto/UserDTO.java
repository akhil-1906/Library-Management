package com.library.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {
	
	private String rollNo;
	private String registrationNumber;
	@NotBlank(message = "First name is mandatory")
	private String firstName;
	private String lastName;
	private String userType;
	private String emailId;
	@NotBlank(message = "Contact Number is mandatory")
	private String mobileNo;
	private String adharCard;
}
