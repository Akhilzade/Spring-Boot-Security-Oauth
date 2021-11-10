package com.test.services;

import com.test.model.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServices {

	@Autowired
	private UserRepository repository;

	public User save(User user){
		return repository.save(user);
	}

	public List<User> getAll(){
		return repository.findAll();
	}

}
