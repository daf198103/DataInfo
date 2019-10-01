package com.dataInfo.data.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataInfo.data.model.User_;
import com.dataInfo.data.repository.UserRepository_;


@Service
public class UserService_ 
{

		
		@Autowired
		private UserRepository_ userRepository;
		
		public UserRepository_ getUserRepository() {
			return userRepository;
		}

		public void setUserRepository(UserRepository_ userRepository) {
			this.userRepository = userRepository;
		}
	

		
		public User_ findByuserName(String userName)
		{
			return userRepository.findByuserName(userName);
			
		}
		
		public User_ findByCpf(String cpf)
		{
			return userRepository.findByCpf(cpf);
			
		}
		
		public List<User_> findAll()
		{
			List<User_> user = new ArrayList<User_>();
			user = userRepository.findAll();
			return user;	
		}
		
		public User_ save(User_ user)
		{
			return userRepository.save(user);
		}
		
		public void delete(User_ user)
		{
			userRepository.delete(user);
		}
		
		public void update(User_ user)
		{
			userRepository.save(user);
		}
		
		
		
		
	
		
	    
}
