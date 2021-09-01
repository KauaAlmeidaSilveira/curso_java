package Interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entInterfaces.contract;
import entInterfaces.parcelas;
import servInterface.ContractService;
import servInterface.PaypalService;

public class Exercicio02 {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		System.out.print("Date (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.next());
		
		System.out.print("Contract value: ");
		Double amount = sc.nextDouble();
		
		contract contract = new contract(number, date, amount);
		
		System.out.print("Enter number of installments: ");
		Integer months = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processContract(contract, months);
		
		System.out.println("INSTALLMENTS: ");
		
		for(parcelas parce : contract.getParcelas()) {
			System.out.println(parce);
		}
		
		
		
		
		
		
	
	
	
		sc.close();
	}

}
