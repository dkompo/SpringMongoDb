package dim.komp.repository;

import java.util.List;

import dim.komp.model.Address;

/**
 * Created by uocin on 10/17/2016.
 */
public interface AddressRepository extends BaseRepository<Address, String> {
	List<Address> findAddressesByCity(String city);
}
