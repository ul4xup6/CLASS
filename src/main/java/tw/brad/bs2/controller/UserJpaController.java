package tw.brad.bs2.controller;

import java.util.List;

import org.mindrot.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.bs2.model.UserV2;
import tw.brad.bs2.repository.UserRepository;
import tw.brad.bs2.service.UserService;

@RestController
public class UserJpaController {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/userjpa")
	public String add(@RequestBody UserV2 user) {
		userRepository.save(user);
		
		return "add";
	}

	@PostMapping("/userjpa2")
	public UserV2 add2(@RequestBody UserV2 user) {
		return userService.addUser(user);
	}
	
	@DeleteMapping("/userjpa/{id}")
	public String delUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return "OK";
	}
	
	@PutMapping("/userjpa1/{id}")
	public String updateUser(@PathVariable Long id, @RequestBody UserV2 user) {
		user.setId(id);
		user.setPasswd(BCrypt.hashpw(user.getPasswd(), BCrypt.gensalt()));
		userRepository.save(user);
		return "userjpa1";
	}
	@PutMapping("/userjpa2")
	public String updateUser(@RequestBody UserV2 user) {
		user.setPasswd(BCrypt.hashpw(user.getPasswd(), BCrypt.gensalt()));
		userRepository.save(user);
		return "userjpa2";
	}
	
	@GetMapping("/userjpa")
	public List<UserV2> query(){
		return (List<UserV2>)userRepository.findAll();
	}
	
}