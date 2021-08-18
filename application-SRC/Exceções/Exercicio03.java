package Exceções;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entReservation.Reservation;

public class Exercicio03 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.print("Room Number: ");
		Integer roomNumber = sc.nextInt();
	
		System.out.print("Check-in date(dd/mm/yyy): ");
		Date checkin = sdf.parse(sc.next());
	
		System.out.print("Check-out date(dd/mm/yyy): ");
		Date checkout = sdf.parse(sc.next());
	
		if(!checkout.after(checkin)) {
		
			System.out.println("Error in reservation : check-out date must be after check-in date");
		
		}else {
		
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
		
			String error = reserv.updateDate(checkin, checkout);
				
			if(error != null) {
				System.out.println("Error in reservation: "+error);
			}else {
				System.out.println(reserv);
			}
		
			System.out.println();
					
			System.out.print("Thank you, have a good night!!");
	
		}	
			
		else{
			System.out.print("Thank you, have a good night!!");
		}
			
			sc.close();
		}

	}	
	
}
		



