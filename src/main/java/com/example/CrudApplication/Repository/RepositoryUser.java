package com.example.CrudApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrudApplication.model.ModelUser;

public interface RepositoryUser extends JpaRepository<ModelUser, Integer>{

}
