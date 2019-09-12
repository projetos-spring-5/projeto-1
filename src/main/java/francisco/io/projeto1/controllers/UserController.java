package francisco.io.projeto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import francisco.io.projeto1.repository.UserRepository;

@Controller
public class UserController {

	private UserRepository userRepository;
	
	//construtor
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	//anotação para criar rota para acessar o metodo
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userRepository.findAll());
		
		return "user";
	}
}
