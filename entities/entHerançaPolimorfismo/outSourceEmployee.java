package entHerançaPolimorfismo;

public class outSourceEmployee extends Employee{

	private Double addCharge;
	
	public outSourceEmployee() {
		super();
	}
	
	
	
	public outSourceEmployee(String name, Integer hours, Double vlrPerH, Double addCharge) {
		super(name, hours, vlrPerH);
		this.addCharge = addCharge;
	}


	public double additionalCharge() {

		return payment() + addCharge + (addCharge*0.10);
	
	}
	
	@Override
	public String toString() {
		return name + " - $ "+ additionalCharge();
	}
	
}
