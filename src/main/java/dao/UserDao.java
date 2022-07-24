package dao;

import model.User;

import java.util.List;

public interface UserDao {

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
    User getUserById(int id);
}
