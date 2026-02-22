package in.example.serviceImpl;

import in.example.entity.User;
import in.example.repository.UserRepository;
import in.example.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repo;

	public UserServiceImpl(UserRepository repo) {
		this.repo = repo;
	}

	@Override
	public void registerUser(User user) {
		repo.save(user);
	}

	@Override
	public User loginUser(String email, String password) {
		return repo.findByEmailAndPassword(email, password);
	}
}
