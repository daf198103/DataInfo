package com.dataInfo.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataInfo.data.model.User_;


public interface UserRepository_ extends JpaRepository<User_, Long>
{

	public User_ findByuserName(String userName);
	
	public User_ findByCpf(String cpf);
	
	public List<User_> findAll();
	
	
}