package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired	//creating and IOC using dependency Injection
	private UserRepository userRepository;

	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		User persistedUser=userRepository.save(user);
		return persistedUser;
	}

	@GetMapping("/getAll")
	public List<User> getAll(){
		List<User> listofusers=userRepository.findAll();
		return listofusers;
	}

//	@GetMapping("/loginEn")
//	public String userLogin(@RequestParam("username") String username,
//			@RequestParam("password") String password)
//	{
//		User obj= new User();
//		obj.setUsername("ASD");
//		obj.setPassword("123");
//		return "You are logged in";
//	}
	
	
//	@PostMapping("/create")
//	public User usercreate(@RequestBody User us) {
//		User u1=new User("A","1","abc@gmail.com","9876543201");
//		System.out.println(u1.toString());
//		return us;
//		
//	}
//	
	@PostMapping("/login")
	public User userlogin(@RequestBody String name, String password)
	{	
		User persistedUser=userRepository.findByNameAndPassword(name,password);
		return persistedUser;
	}
}
