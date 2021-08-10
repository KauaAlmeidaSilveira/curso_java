package HerançaPolimorfismo;

import java.util.ArrayList;
import java.util.List;

import entHerançaPolimorfismo.Account;
import entHerançaPolimorfismo.businessAccount;
import entHerançaPolimorfismo.savingAccount;


public class Exercicio01 {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		list.add(new savingAccount(1001, "Alex", 500.0, 0.01));
		
		list.add(new businessAccount(1002, "Maria", 1000.0, 400.0));
		
		list.add(new savingAccount(1003, "bob", 1000.0, 0.01));
		
		list.add(new businessAccount(1004, "Gleice", 1500.0, 700.0));
		
		double sum=0;
		
		for(Account acc : list) {
			acc.deposit(10);
		}
		
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.print("Total price: "+ sum);
		
	
		
		
		
	}

}
