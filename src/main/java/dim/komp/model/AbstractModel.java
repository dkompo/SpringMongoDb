package dim.komp.model;

/**
 * Created by uocin on 10/14/2016.
 */

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class AbstractModel<T extends Serializable> implements Serializable {

	@Id
	protected T id;

	/**
	 * Gets the id of the entity.
	 *
	 * @return the id of the entity
	 */
	public T getId() {
		return this.id;
	}

	/**
	 * Sets the id of the entity.
	 *
	 * @param id the id of the entity
	 */
	public void setId(final T id) {
		this.id = id;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("AbstractEntity{");
		sb.append("id='").append(this.id).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
