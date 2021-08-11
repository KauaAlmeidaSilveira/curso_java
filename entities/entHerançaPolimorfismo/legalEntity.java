package entHerançaPolimorfismo;

public class legalEntity extends entity {

	private Integer numFunc;
	
	
	public legalEntity() {
		super();
	}


	public legalEntity(String name, double income, Integer numFunc) {
		super(name, income);
		this.numFunc = numFunc;
	}


	public Integer getNumFunc() {
		return numFunc;
	}


	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}
	
	@Override
	public double imp() {
		Double sum = 0.0;
		
		if(numFunc > 10) {
			sum += income*0.14;
		}else {
			sum += income*0.16;
		}
		
		return sum;
	}
	
	@Override
	public String toString() {
		return name +": $"+ String.format("%.2f", imp());
	}
}
