package services;

import java.util.List;

import items.User;
import memory.*;

public class UserService implements IUserService {
	
	Database database;

	public UserService () {
		this.database = new Database();
	}
	
	@Override
	public User getUserById(int id) {
		return database.getUserById(id);
	}

	@Override
	public List<User> getAllUsers() {
		return database.getAllUsers();
	}

	@Override
	public void addUser(User user) {
		database.addUser(user);
		
	}

}
