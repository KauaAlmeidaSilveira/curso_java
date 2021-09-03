package Interfaces;

import java.util.Scanner;

import entInterfaces.BrazilInterestService;
import entInterfaces.taxCountryService;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		Double amount = sc.nextDouble();
		
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		taxCountryService bis = new BrazilInterestService(2.0);
		
		System.out.print("Payment after "+ months +" months: ");
		
		System.out.print(String.format("%.2f", bis.payment(amount, months)));
		
		sc.close();
	}

}
