package ConstrutorEncapsulamento;

import java.util.Scanner;

import entConstrutorEncapsulamento.bankAccount;

public class Exercicio01 {

	public static void main(String[] args) {
		// ENTITIES BANK ACCOUNT
		Scanner sc = new Scanner(System.in);

		bankAccount bA = new bankAccount();
		
		System.out.print("Write account number: ");
		int numBank = sc.nextInt();
		bA.setNumBank(numBank);
		
		System.out.print("Write the name of holder: ");
		String name = sc.next();
		bA.setName(name);
		
		System.out.println("");
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		
		System.out.println("");
		
		if (resp == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			
			double balance = sc.nextDouble();
			
			bA.setBalance(balance);
		} 
		
		
		System.out.println("Account data: ");
		
		System.out.println("");
		
		System.out.println("Account: "+ bA.getNumBank()+", Holder: "+ bA.getName()+ ", Balance: "+ bA.getBalance());
		
		System.out.println("");
		
		System.out.println("Add value in account: ");
		double deposit = sc.nextDouble();
		bA.deposit(deposit);
		
		System.out.println("Updated account data: ");
		
		System.out.println("Account: "+ bA.getNumBank()+", Holder: "+ bA.getName()+ ", Balance: "+ bA.getBalance());
		
		System.out.println("");
		
		System.out.println("Remove value in account: ");
		double withdraw = sc.nextDouble();
		bA.withdraw(withdraw);
		
		System.out.println("Updated account data: ");
		
		System.out.println("Account: "+ bA.getNumBank()+", Holder: "+ bA.getName()+ ", Balance: "+ bA.getBalance());
		
		
		
		sc.close();
	}

}
