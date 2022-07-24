package service;

import dao.UserDaoImpl;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
