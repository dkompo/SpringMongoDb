package dim.komp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dim.komp.model.Address;
import dim.komp.repository.AddressRepository;

/**
 * Created by uocin on 10/17/2016.
 */
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	public void save(Address address) {

		addressRepository.save(address);

	}

	public List<Address> findAddressesByCity(String city) {

		return addressRepository.findAddressesByCity(city);
	}
}
