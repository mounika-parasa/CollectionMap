package customerssss;

import java.io.Serializable;



public class Address implements Comparable<Address>, Serializable,Cloneable{

	String city;
	public String getCity() {
		return city;
	}
	String state;
	String country;
	
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
