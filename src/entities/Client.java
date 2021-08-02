package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name_cli;
	
	private String email;
	
	private Date birthDate;
	
	
	public Client() {

	}


	public Client(String name_cli, String email, Date birthDate) {
		this.name_cli = name_cli;
		this.email = email;
		this.birthDate = birthDate;
	}


	public String getName_cli() {
		return name_cli;
	}


	public void setName_cli(String name_cli) {
		this.name_cli = name_cli;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {

		return "Client: "+ name_cli +" "+ sdf.format(birthDate)+" - "+ email;
		
	}
	
}
