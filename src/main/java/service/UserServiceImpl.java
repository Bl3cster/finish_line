package service;

import dao.UserDaoImpl;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public User addUser(String name, String lastName, byte age) {
        return userDao.addUser(name, lastName, age);
    }

    @Override
    public void removeUserById(int id) {
        userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
