package com.application.repository;

import java.util.List;

import com.application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import com.application.model.User;

//import com.lms.login_signup_jwt.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> findByUserName(String userName);
	Optional<Employee> findByEmail(String email);  // Method to find users by email
}