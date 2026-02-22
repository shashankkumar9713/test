package in.example.service;

import in.example.entity.User;

public interface UserService {
	
	void registerUser(User user);

	User loginUser(String email, String password);
}
