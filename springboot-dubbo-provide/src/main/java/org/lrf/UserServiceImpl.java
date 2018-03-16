package org.lrf;

import org.lrf.UserServicie.UserService;
import org.lrf.UserServicie.entity.User;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService{

	@Override
	public User createUser(String name) {
		User user = new User();
		user.setName(name);
		return user;
	}
	
}
