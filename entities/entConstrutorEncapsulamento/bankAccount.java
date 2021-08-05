package entConstrutorEncapsulamento;

public class bankAccount {

	private String name;
	private int numBank;
	private double balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumBank() {
		return numBank;
	}
	public void setNumBank(int numBank) {
		this.numBank = numBank;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit; 
	}
	
	public void withdraw(double withdraw) {
		balance -= withdraw;
	}
	
	
	
	
	
}
