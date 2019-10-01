package com.dataInfo.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dataInfo.data.model.User_;
import com.dataInfo.data.service.UserService_;

@RestController 
@RequestMapping(value = "/api")
public class UserController_ 
{
	
	@Autowired
	private UserService_ userService;

	public UserService_ getUserService() {
		return userService;
	}

	public void setUserService(UserService_ userService) {
		this.userService = userService;
	}

	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<User_>> searchAll() {
        List<User_> users = userService.findAll();
        return new ResponseEntity<List<User_>>(users, HttpStatus.OK);
    }	

	@RequestMapping(value = "/byname/{name}", method = RequestMethod.GET)
    public ResponseEntity<User_> searchByName(@PathVariable("name") String name)
    {
		User_ user = userService.findByuserName(name);
		if(user==null) 
		{
			return new ResponseEntity<User_>(null,null,HttpStatus.OK);
		}
 
        return new ResponseEntity<User_>(user, new HttpHeaders(), HttpStatus.OK);
    }
	
	
    @RequestMapping(value = "/bycpf/{cpf}", method = RequestMethod.GET)
	public ResponseEntity<User_> searchByCpf(@PathVariable("cpf") String cpf)
	{
		User_ user = userService.findByCpf(cpf);
		if(user==null) 
		{
			return new ResponseEntity<User_>(null,null,HttpStatus.OK);
		}
		return new ResponseEntity<User_>(user, new HttpHeaders(),HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<User_> save(@RequestBody User_ user) 
    {
	  userService.save(user); 
	  return new ResponseEntity<User_>(user, new  HttpHeaders(),HttpStatus.OK); 
    }
	
	
    @RequestMapping(value = "/save", method = RequestMethod.PUT)
	public ResponseEntity<User_> update(@RequestBody User_ user)
	{
		User_ usu = userService.findByCpf(user.getCpf());
		usu.setCpf(user.getCpf());usu.setEmail(user.getEmail());usu.setAccessProfile(user.getAccessProfile());usu.setFunction(user.getFunction());
		usu.setPhone(user.getPhone());usu.setSituation(user.getSituation());usu.setUserName(user.getUserName());
		userService.save(usu);
		return new ResponseEntity<User_>(usu, new HttpHeaders(),HttpStatus.OK);
	}
	
	 @RequestMapping(value = "/delete/{cpf}", method = RequestMethod.DELETE)
	 public ResponseEntity<User_> deleteByCpf(@PathVariable("cpf") String cpf) {
		 User_ user_ = userService.findByCpf(cpf);
		 userService.delete(user_);
	 return  new ResponseEntity<User_>(user_, new HttpHeaders(),HttpStatus.OK); }
	 
		
	
	

}