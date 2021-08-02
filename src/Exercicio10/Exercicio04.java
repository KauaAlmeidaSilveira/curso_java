package Exercicio10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.products;
import entities.enums.OrderStatus;


public class Exercicio04 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		
		System.out.println();
		
		System.out.print("Name: ");
		String name_cli = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birth Date (dd/mm/yyyy): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name_cli, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many Items to this order? ");
		int crtl = sc.nextInt();
		
		for(int i=0; i<crtl; i++) {
			System.out.println("Enter #"+(i+1)+" item data");
			
			System.out.print("Product name: ");
			sc.nextLine();
			String name_pro = sc.nextLine();
			
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			
			products pro = new products(name_pro, price);
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, price, pro);
			
			order.addItem(orderItem);
		}
		
		System.out.println("ORDER SUMMARY: ");
		
		System.out.print(order);
		
		
		sc.close();
	}

}
