package entHerançaPolimorfismo;

public abstract class entity {

	protected String name;
	protected double income;
	
	public entity() {

	}

	public entity(String name, double income) {
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	public abstract double imp();
	
}
