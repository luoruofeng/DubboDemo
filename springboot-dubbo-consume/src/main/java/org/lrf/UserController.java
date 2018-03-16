package org.lrf;

import org.lrf.UserServicie.UserService;
import org.lrf.UserServicie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user/{name}",method=RequestMethod.POST)
	public User createUser(@PathVariable("name")String username) {
		return userService.createUser(username);
	}
}
