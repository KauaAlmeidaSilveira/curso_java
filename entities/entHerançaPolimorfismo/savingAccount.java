package entHeran�aPolimorfismo;

public class savingAccount extends Account{

	private Double interestRate;
	
	public savingAccount() {
		super();
	}

	public savingAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {	
		balance += balance * interestRate;
	}
	
	@Override
	public void withdrawn(double amount) {	
		balance -= amount;	
	}
	
	
}
