package it.dao;

import java.util.List;

import it.model.User;

public interface Dao {
	
	public List<User> getUserList();
	public void addUser(User user);

}
