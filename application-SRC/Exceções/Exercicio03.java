package Exceções;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Scanner;

import entExceções.Reservation;
import exceptions.DomainException;

public class Exercicio03 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		
		try {
		
			System.out.print("Room Number: ");
			Integer roomNumber = sc.nextInt();
	
			System.out.print("Check-in date(dd/mm/yyy): ");
			Date checkin = sdf.parse(sc.next());
	
			System.out.print("Check-out date(dd/mm/yyy): ");
			Date checkout = sdf.parse(sc.next());
	
			Reservation reserv = new Reservation(roomNumber, checkin, checkout);
	
			System.out.println(reserv);
	
			System.out.println();
		
			System.out.print("Would you like to update the reservation ?(yes/no)");
			char resp = sc.next().charAt(0);
	
			System.out.println();
		
	
			if(resp == 'y') {		
				System.out.println("Enter data to update the reservation: ");
			
				System.out.print("Check-in date(dd/mm/yyy): ");
				checkin = sdf.parse(sc.next());
				
				System.out.print("Check-out date(dd/mm/yyy): ");
				checkout = sdf.parse(sc.next());
		
				reserv.updateDate(checkin, checkout);
				
				System.out.println(reserv);
			
				System.out.println();
					
				System.out.print("Thank you, have a good night!!");
	
			}
			else{
				System.out.print("Thank you, have a good night!!");
			}
		}catch(ParseException e){
			System.out.println("Invalid date format");
		}catch(DomainException e){
			System.out.println("Error in reservation: "+ e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
			sc.close();
	}	
	
}
		



