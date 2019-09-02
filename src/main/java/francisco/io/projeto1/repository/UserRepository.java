package francisco.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import francisco.io.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
