package dim.komp.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by uocin on 10/17/2016.
 * //
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {
	T findOne(ID id);

	<S extends T> S save(S entity);

	long count();

	void delete(T entity);
}
