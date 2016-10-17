package dim.komp.dao;

import dim.komp.model.User;

/**
 * Created by uocin on 10/13/2016.
 */
public interface UserDao {

	void saveUser(User user);

	public void saveOrUpdate(User user);
}