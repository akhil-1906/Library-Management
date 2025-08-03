package com.library.user.service;

import org.springframework.stereotype.Service;

import com.library.user.dto.UserDTO;
import com.library.user.entity.UserEntity;
import com.library.user.exceptions.UserAlreadyExistException;
import com.library.user.exceptions.UserException;
import com.library.user.repository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepo;

	@Transactional
	public String create(UserDTO userDTO) {
		UserEntity userEntity = UserEntity.builder().rollNo(userDTO.getRollNo())
				.registrationNumber(userDTO.getRegistrationNumber()).firstName(userDTO.getFirstName())
				.lastName(userDTO.getLastName()).mobileNo(userDTO.getMobileNo()).userType(userDTO.getUserType())
				.emailId(userDTO.getEmailId()).adharCard(userDTO.getAdharCard()).build();
		if (userRepo.existsByRollNo(userDTO.getRollNo())) {
			throw new UserAlreadyExistException("User Already Exist with this Roll number");
		}
		
		try {

			userRepo.save(userEntity);

		} catch (Exception e) {
			e.printStackTrace();
			throw new UserException("User Creation Failed");
		}
		return "User Created";
	}

}
