package entHerançaPolimorfismo;

public class businessAccount extends Account{

	private Double loanLimit;
	
	public businessAccount() {
		super();
	}

	public businessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
		
	}
	
	@Override
	public void withdrawn(double amount) {	
		balance -= amount + 7.0;
	}
	
}
