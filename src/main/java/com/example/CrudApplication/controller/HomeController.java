package com.example.CrudApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudApplication.model.ModelUser;
import com.example.CrudApplication.service.ServiceUser;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class HomeController {

	@Autowired
	private ServiceUser serviceuser;
	

	@GetMapping(path="/api/users", produces = {"application/json"})
	public List<ModelUser> getAllStudentsAPI()
	{
		return serviceuser.getAllUser();
	}

@PostMapping("/api/users")
public ModelUser AddNewUser(@RequestBody ModelUser modeluser)
{
	Optional<ModelUser> opt= serviceuser.SearchModelUser(modeluser.getuserId());
	if(opt.isEmpty())
	{
		return serviceuser.AddUser(modeluser);
	}
	else
		return new ModelUser();
}
@GetMapping("/api/users/{id}")
public Optional<ModelUser>getuserRecord(@PathVariable("id") int userId){
	return serviceuser.SearchModelUser(userId);
}

@PutMapping("/api/users/{id}")
public ModelUser UpdateNewUser(@RequestBody ModelUser modeluser)
{
	Optional<ModelUser> opt= serviceuser.SearchModelUser(modeluser.getuserId());
	System.out.println(opt.isPresent());
	if(opt.isPresent())
	{
		return serviceuser.EditUser(modeluser);
	}
	else
		return new ModelUser();
}
@DeleteMapping("/api/users/{id}")
public Optional<ModelUser>DeleteUserId(@PathVariable("id") int userId){
	Optional<ModelUser>opt=serviceuser.SearchModelUser(userId);
	if(opt.isPresent())
	{
		serviceuser.DeleteUser(userId);
		return opt;
	}
	else
		return opt;
	
	
}
}
