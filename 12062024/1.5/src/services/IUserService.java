package services;

import java.util.List;

import items.User;

public interface IUserService {
    User getUserById(int id);
    List<User> getAllUsers();
    void addUser(User user);
}
