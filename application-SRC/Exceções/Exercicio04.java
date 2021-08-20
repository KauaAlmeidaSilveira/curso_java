package Exceções;

import java.util.Scanner;

import entExceções.Account;
import exceptions.DomainException;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try{
		System.out.println("Enter account data: ");
		
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		acc.withdrawn(amount);
		
		System.out.println("New balance: "+ acc.getBalance());
		
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
