package dim.komp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dim.komp.model.Address;
import dim.komp.model.User;
import dim.komp.service.AddressService;
import dim.komp.service.UserService;

/**
 * Created by uocin on 10/13/2016.
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring-conf.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		AddressService addressService = (AddressService) ctx.getBean("adressService");

//		List<User> users = userService.findByName("Dimitris");
//		for (User user : users) {
//			userService.delete(user);
//		}
		User usr = new User("George", "2199999999", "23-10-90");

		List<Address> addresses = addressService.findAddressesByCity("Los Angeles");
		Address address = new Address();
		address.setBuilding("Tower A");
		address.setCity("Athens");
		address.setState("Greece");
		addressService.save(address);
		usr.setAddress(address);
		userService.saveFromRepo(usr);

		System.out.println(userService.findAll() + "Number of users on db: " + userService.count());
	}
}
