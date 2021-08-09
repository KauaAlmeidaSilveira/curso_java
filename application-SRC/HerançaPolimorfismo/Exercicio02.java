package HerançaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entHerançaPolimorfismo.Employee;
import entHerançaPolimorfismo.outSourceEmployee;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listE = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Employee #"+ (i+1) +" data:");
			
			System.out.print("Outsourced (y/n)?");
			String crtl = sc.next();
			
			if(crtl.equals("n")) 
			{				
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per hours: ");
				Double vlrPerH = sc.nextDouble();
	
				Employee emp = new Employee(name, hours, vlrPerH);
				
				listE.add(emp);
			}
			else 
			{
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per hours: ");
				Double vlrPerH = sc.nextDouble();
				
				System.out.print("Additional charge: ");
				Double addCharge = sc.nextDouble();
				
				Employee emp = new outSourceEmployee(name, hours, vlrPerH, addCharge);
				
				listE.add(emp);
				
			}
			
		}
		
		System.out.println();
		
		System.out.print("PAYMENTS: (Employee)");
		
		System.out.println();
		
		for(Employee e : listE) {
			System.out.println(e);
		}
		
		
		sc.close();		
	}

}
