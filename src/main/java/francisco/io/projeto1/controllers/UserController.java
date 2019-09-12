package francisco.io.projeto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import francisco.io.projeto1.service.UserService;

@Controller
public class UserController {

	//DI - Inejção de dependencia
	@Autowired
	UserService userService;
	
	//anotação para criar rota para acessar o metodo
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userService.findAll());
		
		return "user";
	}
}
