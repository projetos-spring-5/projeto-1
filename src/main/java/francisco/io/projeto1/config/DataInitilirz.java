package francisco.io.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import francisco.io.projeto1.entity.User;
import francisco.io.projeto1.repository.UserRepository;

@Component
public class DataInitilirz implements ApplicationListener<ApplicationEvent> {

	// injeção de dependecia
	@Autowired
	UserRepository userRepository;

	// sobresquevendo o metodo, e chamado toda vez que é inicializado
	@Override
	public void onApplicationEvent(ApplicationEvent event) {

		// busca todos os usuarios do banco
		List<User> users = userRepository.findAll();

		// cria usuarios
		if (users.isEmpty()) {
			createUser("Francisco Daniel", "francisco@email.com");
			createUser("Tatiane Lobo", "tati@email.com");
			createUser("João", "joao@email.com");
		}

		// buscando o usuario com id = 2
		// User user = userRepository.getOne(2L);
		// deletando por id
		// User user = userRepository.deleteById(2L);

		// System.out.println(user.getName());

		// para editar
		/*
		 * user.setName("novo nome"); userRepository.save(user);
		 */

	}

	// metodo para salvar novos usuarios
	public void createUser(String nome, String email) {

		User user = new User(nome, email);

		userRepository.save(user);
	}

}
