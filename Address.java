public class Address {

	private String street;
	private String postcode;
	private String district;
	private String state;
	
	//default constructor
	public Address(){
	}
	//class constructor
	public Address(String street, String postcode, String district, String state){
		this.street = street;
		this.postcode = postcode;
		this.district = district;
		this.state = state;
	}
	
	//getter and setter method
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//toString method
	public String toString() {
		return street + " " + postcode + " " + district + " " + state;
	}
	
}
