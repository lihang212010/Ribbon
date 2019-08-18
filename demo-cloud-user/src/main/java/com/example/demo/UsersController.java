package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UsersController {
@Autowired
private UsersRepository usersRepository;

@RequestMapping("/{id}")
public Optional<Users> fingById(@PathVariable Long id) {
	Optional<Users> users=usersRepository.findById(id);
	return users;
}
}
