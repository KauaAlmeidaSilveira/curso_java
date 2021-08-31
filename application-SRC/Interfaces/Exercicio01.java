package Interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entInterfaces.aluguelCarro;
import entInterfaces.veiculo;
import servInterface.BrazilTaxServices;
import servInterface.servAluguel;

public class Exercicio01 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rental data");
		
		System.out.print("Car model: ");
		String model = sc.nextLine();
		
		System.out.print("Pickup (dd/mm/yyyy hh:mm): ");
		Date start = sdf.parse(sc.nextLine());
		
		System.out.print("Return (dd/mm/yyyy hh:mm): ");
		Date finish = sdf.parse(sc.nextLine());
		
		aluguelCarro aC = new aluguelCarro(start, finish, new veiculo(model));
		
		System.out.print("Price per Hour: ");
		Double pricePerHour = sc.nextDouble();
		
		System.out.print("Price per Day: ");
		Double pricePerDay = sc.nextDouble();
		
		servAluguel sA = new servAluguel(pricePerDay, pricePerHour, new BrazilTaxServices());
		
		sA.processFatura(aC);
		
		System.out.println("FATURA: ");
		
		System.out.println("Basic Payment: " + String.format("%.2f", aC.getFatura().getBasicPayment()));   
		
		System.out.println("Tax: " + String.format("%.2f", aC.getFatura().getTax()));
		
		System.out.println("Total payment: " + String.format("%.2f", aC.getFatura().getTotalPayment()));
		
		
		sc.close();
	}

}
