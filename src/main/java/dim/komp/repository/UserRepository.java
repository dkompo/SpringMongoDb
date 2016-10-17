package dim.komp.repository;

import java.util.List;

import dim.komp.model.User;

/**
 * Created by uocin on 10/13/2016.
 */
public interface UserRepository extends BaseRepository<User, String> {

	List<User> findUsersByName(String name);

	List<User> findAll();

}