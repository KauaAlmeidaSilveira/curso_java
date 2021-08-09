package HerançaPolimorfismo;

import entHerançaPolimorfismo.Account;
import entHerançaPolimorfismo.savingAccount;


public class Exercicio01 {

	public static void main(String[] args) {
		
		/*Account acc1 = new Account(10, "Alex", 1000.0);
		
		acc1.withdrawn(200.0);
		
		System.out.println(acc1.getBalance());
		
		Account acc2 = new savingAccount(11, "Maria", 1000.0, 0.05);
		
		acc2.withdrawn(200.0);
		
		System.out.println(acc2.getBalance());
		
		Account acc3 = new businessAccount(12, "João", 1000.0, 500.0);
		
		acc3.withdrawn(200.0);
		
		System.out.println(acc3.getBalance());*/
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y  = new savingAccount(1023, "Maria", 1000.0, 0.05);
		
		x.withdrawn(50.0);
		y.withdrawn(50.0);
		
		System.out.println("x: " + x.getBalance());
		
		System.out.println("y: " + y.getBalance());
		
		
	}

}
