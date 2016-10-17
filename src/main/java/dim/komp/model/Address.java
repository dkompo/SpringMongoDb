package dim.komp.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by uocin on 10/13/2016.
 */
@Document(collection = "adresses")
public class Address extends AbstractModel<String> {

	private String building;

	private String pincode;
	private String city;
	private String state;

	public String getBuilding() {
		return building;
	}

	public void setBuilding(final String building) {
		this.building = building;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(final String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	@Override public String toString() {
		return "Address{" +
				"building='" + building + '\'' +
				", pincode='" + pincode + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				'}';
	}
}
