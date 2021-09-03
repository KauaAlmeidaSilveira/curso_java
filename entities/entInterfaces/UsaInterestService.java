package entInterfaces;

public class UsaInterestService implements taxCountryService{

	private double interestRate;

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
