package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    User addUser(String name, String lastName, byte age);

    void removeUserById(int id);

    List<User> getAllUsers();

    void update(User user);
    User getUserById(int id);
}
