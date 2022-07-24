package dao;

import model.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDaoImpl implements UserDao{
    @PersistenceContext
    public EntityManager em;


    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    @Override
    public void removeUserById(long id) {

    }

    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> nameQuery = em.createNamedQuery("User.getAll", User.class);
        return nameQuery.getResultList();
    }

    @Override
    public void cleanUsersTable() {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
