package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    public EntityManager em;


    @Override
    public User addUser(String name, String lastName, byte age) {
        em.getTransaction().begin();
        User userFromDB = em.merge(new User(name, lastName, age));
        em.getTransaction().commit();
        return userFromDB;
    }

    @Override
    public void removeUserById(int id) {
        em.getTransaction().begin();
        em.remove(getUserById(id));
        em.getTransaction().commit();
    }

    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> nameQuery = em.createNamedQuery("User.getAll", User.class);
        return nameQuery.getResultList();
    }

    @Override
    public void update(User user){
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    @Override
    public User getUserById(int id) {
        return em.find(User.class, id);
    }
}
