package dim.komp.service;

import java.util.List;

import dim.komp.model.Address;

/**
 * Created by uocin on 10/17/2016.
 */
public interface AddressService {
	void save(Address address);

	List<Address> findAddressesByCity(String city);

}
