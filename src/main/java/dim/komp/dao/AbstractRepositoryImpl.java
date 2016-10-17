//package dim.komp.dao;
//
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
//import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
//import org.springframework.stereotype.Repository;
//
//import dim.komp.model.AbstractModel;
//
///**
// * Created by uocin on 10/14/2016.
// */
//@Repository
//public class AbstractRepositoryImpl<T extends AbstractModel> extends SimpleMongoRepository<T, Long> {
//
//	/**
//	 * Creates a new {@link SimpleMongoRepository} for the given {@link MongoEntityInformation} and {@link MongoTemplate}.
//	 *
//	 * @param metadata        must not be {@literal null}.
//	 * @param mongoOperations
//	 */
//	public AbstractRepositoryImpl(final MongoEntityInformation<T, Long> metadata,
//			final MongoOperations mongoOperations) {
//		super(metadata, mongoOperations);
//	}
//
//	public T insertEntity(final T entity) {
//
//		if (entity.getId() != null) {
//			return super.save(entity);
//		} else {
//			return super.insert(entity);
//
//		}
//	}
//}
