package dim.komp.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by uocin on 10/13/2016.
 */
@Document(collection = "users")
public class User extends AbstractModel<String> {

	public User(String name, String contact, String dateOfBirth) {

		this.name = name;
		this.contact = contact;
		this.dateOfBirth = dateOfBirth;
	}

	//	@Id
//	private String userId;
	private String name;
	private String contact;
	@Field("dob")
	private String dateOfBirth;
	private String nickname;

	@DBRef
	private Address address;
//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(final String userId) {
//		this.userId = userId;
//	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(final String contact) {
		this.contact = contact;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(final String nickname) {
		this.nickname = nickname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(final Address address) {
		this.address = address;
	}

	@Override public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", contact='" + contact + '\'' +
				", dateOfBirth='" + dateOfBirth + '\'' +
				", nickname='" + nickname + '\'' +
				", address=" + address +
				'}';
	}
}
