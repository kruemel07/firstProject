package de.simon.dao;

import java.util.List;

import de.simon.model.User;


public interface UserDAO {

	long save (User user);
	void delete (long id);
	List<User> getAll();
	User findById (long id);
}
