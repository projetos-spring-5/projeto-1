package francisco.io.projeto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import francisco.io.projeto1.entity.User;
import francisco.io.projeto1.repository.UserRepository;
/*
 * Regras de negocio
 * 
 * */

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll(){
		
		return userRepository.findAll();
	}
	
}
