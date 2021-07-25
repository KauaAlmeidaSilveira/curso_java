package entities;

public class rent {

	private String name;
	private String email;
	private int numQ;
	
	
	public String toString() {
		return name+", "+ email;
	}
	
	public rent(String name, String email, int numQ) {
		this.name = name;
		this.email = email;
		this.numQ = numQ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumQ() {
		return numQ;
	}
	public void setNumQ(int numQ) {
		this.numQ = numQ;
	}
	
	
	
	
}
