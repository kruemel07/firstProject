package de.simon.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import de.simon.model.User;

@Transactional
@Component
public class UserDAOImpl implements UserDAO{

	@PersistenceContext
	private EntityManager em;

	@Override
	public long save(User user) {
		em.persist(user);
		return user.getUserID();
	}

	@Override
	public void delete(long id) {
		em.remove(findById(id));
	}

	@Override
	public List<User> getAll() {
		return em.createQuery("SELECT u FROM User u", User.class).getResultList();
	}

	@Override
	public User findById(long id) {
		return em.createQuery("SELECT u FROM User u WHERE userId="+id+"'", User.class).getSingleResult();
	}

	@Override
	public User findByUserName(String username) {
		return em.createQuery("SELECT u FROM User u WHERE userName=" +username +"'", User.class).getSingleResult();
	}
}
