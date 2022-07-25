package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    User addUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void update(User user);
    User getUserById(long id);
}
