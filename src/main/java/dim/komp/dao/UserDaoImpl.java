package dim.komp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import dim.komp.model.User;

/**
 * Created by uocin on 10/13/2016.
 */
@Repository
public class UserDaoImpl /*extends AbstractRepositoryImpl<User>*/ implements UserDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private MongoOperations mongoOps;


	public void saveUser(User user) {
		mongoTemplate.save(user, "users");
	}

	public List<User> findByName(String name) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("name").is(name);
////				mongoTemplate.find(q\)
		return new ArrayList<User>();
	}

}
