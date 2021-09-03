package entInterfaces;

public class BrazilInterestService implements taxCountryService{

	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
