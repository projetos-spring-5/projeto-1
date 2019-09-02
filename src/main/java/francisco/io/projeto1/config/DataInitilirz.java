package francisco.io.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import francisco.io.projeto1.entity.User;
import francisco.io.projeto1.repository.UserRepository;

@Component
public class DataInitilirz implements ApplicationListener<ApplicationEvent>{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		
		List<User> users = userRepository.findAll();
		
		if(users.isEmpty()) {
			User user = new User();
		
			user.setEmail("franciscodaniel@hotmail.com");
			user.setName("Francisco");
		
			userRepository.save(user);
		}
		
	}

}
