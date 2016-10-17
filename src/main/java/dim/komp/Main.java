package dim.komp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dim.komp.model.User;
import dim.komp.service.UserService;

/**
 * Created by uocin on 10/13/2016.
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring-conf.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		List<User> users = userService.findByName("spring user");
		for (User user : users) {
			userService.delete(user);
		}

		System.out.println(userService.findAll());
	}
}
