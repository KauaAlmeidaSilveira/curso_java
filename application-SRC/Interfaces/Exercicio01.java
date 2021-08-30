package Interfaces;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entInterfaces.Vehicle;
import entInterfaces.carRental;
import servInterface.brazilTaxService;
import servInterface.rentalService;

public class Exercicio01 {

	public static void main(String[] args) throws ParseException{

		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rental data: ");
		
		System.out.print("Car model: ");
		String model = sc.nextLine();
		
		System.out.print("Pickup (dd/mm/yyyy hh:ss): ");
		Date start = sdf.parse(sc.nextLine());
		
		System.out.print("Return (dd/mm/yyyy hh:ss): ");
		Date finish = sdf.parse(sc.nextLine());
		
		carRental cr = new carRental(start, finish, new Vehicle(model));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Enter price per Day: ");
		double pricePerDay = sc.nextDouble();
		
		rentalService rs = new rentalService(pricePerHour, pricePerDay, new brazilTaxService());
		
		rs.processInvoice(cr);
		
		System.out.println("INVOICE: ");
		
		System.out.println("Basic Payment: "+ String.format("%.2f", cr.getInvoice().getBasicPayment()));
		
		System.out.println("Tax: "+ String.format("%.2f", cr.getInvoice().getTax()));
		
		System.out.println("Total payment: "+ String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		
		
		sc.close();
	}

}
 