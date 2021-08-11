package entHerançaPolimorfismo;

public class physicsEntity extends entity{

	private double healthSpending;
	
	public physicsEntity() {
		super();
	}

	public physicsEntity(String name, double income, double healthSpending) {
		super(name, income);
		this.healthSpending = healthSpending;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double imp() {
		double sum =0;
		if(income > 20000) 
		{
			if(healthSpending != 0) 
			{
				sum += (income*0.25)-(healthSpending * 0.50);
			}
			else 
			{
				sum += (income*0.25);
			}
		}
		else if(income < 20000)
		{
			if(healthSpending != 0) 
			{
				sum += (income*0.15)-(healthSpending * 0.50);
			}
			else 
			{
				sum += (income*0.15);
			}		
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return name +": $"+ String.format("%.2f", imp());
	}

}
