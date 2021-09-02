package entInterfaces;

public class Funcionarios implements Comparable<Funcionarios>{

	private String name;
	private Double salary;
	
	
	public Funcionarios(String name, Double salary) {

		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Funcionarios o) {
		return name.compareTo(o.getName());
	}
	
	
	
}
