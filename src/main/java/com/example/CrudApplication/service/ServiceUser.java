package com.example.CrudApplication.service;

import java.util.List;
import java.util.Optional;

import com.example.CrudApplication.model.ModelUser;

public interface ServiceUser {

	List<ModelUser>getAllUser();
	ModelUser AddUser(ModelUser user);
	ModelUser EditUser(ModelUser user);
	Optional<ModelUser>SearchModelUser(int id);
	void DeleteUser(int id);
}
