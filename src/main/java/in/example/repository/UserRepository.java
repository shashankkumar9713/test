package in.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.example.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmailAndPassword(String email, String password);
}
