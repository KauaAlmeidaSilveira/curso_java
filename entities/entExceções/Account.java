package entExceções;

import exceptions.DomainException;

public class Account extends entHerançaPolimorfismo.Account{

	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		
		super(number, holder, balance);
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdrawn(double amount) {	
		if(amount>withdrawLimit){
			throw new DomainException("Withdrawal error: The amount is greater than the withdraw limit");
		}else if(balance == 0) {
			throw new DomainException("Withdrawal error: The balance is empty");
		}else if(amount>balance) {
			throw new DomainException("Withdrawal error: The amount is greater than the balance");
		}
		balance -= amount;	
	}
	
	public void deposit(double amount) {	
		balance += amount;
	}
	
}
