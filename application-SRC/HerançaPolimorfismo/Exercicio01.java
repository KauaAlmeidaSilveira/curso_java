package HerançaPolimorfismo;

import entHerançaPolimorfismo.Account;
import entHerançaPolimorfismo.businessAccount;
import entHerançaPolimorfismo.savingAccount;


public class Exercicio01 {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		
		acc1.withdrawn(200);
		
		System.out.println(acc1.getBalance());
		
		savingAccount acc2 = new savingAccount(1002, "Maria", 1000.0, 0.05);
		
		acc2.updateBalance();
		
		System.out.println(acc2.getBalance());
		
		Account acc3 = new businessAccount(1003, "bob", 1000.0, 500.0);
		
		acc3.withdrawn(200.0);
		
		System.out.println(acc3.getBalance());
		
		
	}

}
