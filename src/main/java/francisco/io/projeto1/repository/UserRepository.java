package francisco.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import francisco.io.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	//consulta pelo nome, metodo do spirng
	User findByName(String name);
	
	User findByEmail(String email);
	
	//consulta ignorando letras minusculas e maiusculas 
	User findByNameIgnoreCase(String name);
	
	//usando querys
	@Query("select u from User u where u.id = ?1")
	User findByBuscarPorId(Long id);
	
	@Query("select u from user u where u.name like %?1%")
	User findByBuscarContenha(String name);
	
}
