package com.example.CrudApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudApplication.Repository.RepositoryUser;
import com.example.CrudApplication.model.ModelUser;

@Service
public class ServiceUserImplements implements ServiceUser {
	
	@Autowired
	private RepositoryUser reposUser;

	@Override
	public List<ModelUser> getAllUser() {
		// TODO Auto-generated method stub
		return reposUser.findAll();
	}

	@Override
	public ModelUser AddUser(ModelUser user) {
	
		return reposUser.save(user);
	}

	@Override
	public Optional<ModelUser> SearchModelUser(int id) {
		
		return reposUser.findById(id);
	}

	@Override
	public void DeleteUser(int id) {
		// TODO Auto-generated method stub
		reposUser.deleteById(id);
		
	}

	@Override
	public ModelUser EditUser(ModelUser user) {
	    
		return reposUser.save(user);
	}



}
