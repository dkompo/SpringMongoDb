package dim.komp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dim.komp.dao.UserDao;
import dim.komp.model.User;
import dim.komp.repository.UserRepository;

/**
 * Created by uocin on 10/13/2016.
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserRepository userRepository;

	public void save(User user) {

		userDao.saveUser(user);

	}

	public List<User> findByName(String name) {

		return userRepository.findUsersByName(name);
	}

	public void saveOrUpdate(User user) {

		userDao.saveOrUpdate(user);

	}

	public void saveFromRepo(User user) {

		userRepository.save(user);

	}

	public List<User> findAll() {

		return userRepository.findAll();
	}

	public List<User> findUsersByName(String name) {
		return userRepository.findUsersByName(name);
	}

	public long count() {
		return userRepository.count();

	}

	public void delete(User user) {
		userRepository.delete(user);
	}
}
