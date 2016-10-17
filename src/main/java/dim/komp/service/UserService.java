package dim.komp.service;

import java.util.List;

import dim.komp.model.User;

/**
 * Created by uocin on 10/13/2016.
 */
public interface UserService {
	void saveOrUpdate(User user);

	List<User> findByName(String name);

	void save(User user);

	List<User> findAll();

	List<User> findUsersByName(String name);

	public void saveFromRepo(User user);

	long count();

	void delete(User user);
}
