package com.littlehelpbykr.kr.users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

	@Autowired
	private UserDaoService service;

	@GetMapping("/")
	public ModelAndView welcomePage() {
		return new ModelAndView("welcome");
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return service.getUsers();
	}

	/*@PostMapping(value = "/users")
	public User addUser(Model model, //
			@ModelAttribute("users") @RequestBody User user) {
		User userObj = service.addUser(user);
		return userObj;
	}*/
	
	@PostMapping(value = "/users")
	public User addUser(@RequestBody User user) {
		User userObj = service.addUser(user);
		return userObj;
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		User user = service.getUser(id);
		if (user == null) {
			throw new UserNotFoundException("User is not found with this id: " + id);
		}
		return user;
	}
	
	@GetMapping("/users/")
	public User getSpecificUser(@RequestParam("data") int id) {
		User user = service.getUser(id);
		if (user == null) {
			throw new UserNotFoundException("User is not found with this id: " + id);
		}
		return user;
	}

	@DeleteMapping("/users/{id}")
	public void removeUser(@PathVariable int id) {
		User user = service.getUser(id);
		service.removeUser(user);

	}
	
	 @PutMapping(value = "/user/{id}")
	    public User updateUser(@PathVariable("id") int id, @RequestBody User user) {
	 
	        User currentUser = service.getUser(id);
	 
	        currentUser.setName(user.getName());
	        currentUser.setDob(user.getDob());
	        addUser(currentUser);
	 
	        return currentUser;
	    }
	
	@DeleteMapping("/users")
	public void deleteUser(@RequestParam("data") int id) {
		User user = service.getUser(id);
		service.removeUser(user);

	}

}
