public class PrincipalName {

	private String FirstName;
	private String LastName;
	
	//default constructor
	public PrincipalName(){		
	}
	//constructor
	public PrincipalName(String FirstName ,String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	//getter and setter method
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getSecondName() {
		return LastName;
	}
	public void setSecondName(String secondName) {
		this.LastName = secondName;
	}
	
	//toString method
	public String toString() {
		return FirstName + " " + LastName;
	}
}
