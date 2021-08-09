package entHerançaPolimorfismo;

public class Employee {

	protected String name;
	protected Integer hours;
	protected Double vlrPerH;
	

	public Employee() {

	}


	public Employee(String name, Integer hours, Double vlrPerH) {

		this.name = name;
		this.hours = hours;
		this.vlrPerH = vlrPerH;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}


	public Double getVlrPerH() {
		return vlrPerH;
	}


	public void setVlrPerH(Double vlrPerH) {
		this.vlrPerH = vlrPerH;
	}	
	
	public double payment() {
		return hours*vlrPerH;
	}
	
	@Override
	public String toString() {
		return name + " - $ "+ payment();
	}
}
