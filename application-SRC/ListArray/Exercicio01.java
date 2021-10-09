package ListArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entListArray.Employee;
public class Exercicio01 {

	public static void main(String[] args) {
		// ENTITIES EMPLYOEE
		
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered?");
		int x = sc.nextInt();
		
		for(int i=0; i<x; i++) {
			System.out.println();
			
			System.out.println("Employee #"+(i+1));
			
			System.out.println();
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.print("Id used, try other: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
			
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream()
				.filter(y -> y.getId() == id)
				.findFirst()
				.orElse(null);
		
		if(emp != null) {
			System.out.print("Enter the percentage: ");
			double tax = sc.nextDouble();
			emp.increaseSalary(tax);
			
			System.out.println();
			
			System.out.println("List of employees: ");
			
			System.out.println();
			
			for(Employee e : list) {
				System.out.println(e);
			}
			
		}else {
			System.out.print("Id not found!!");
			System.out.println();
			
			System.out.println("List of employees: ");
			
			System.out.println();
			
			for(Employee e : list) {
				System.out.println(e);
			}
		}
		
		
		sc.close();
	}	
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream()
				.filter(x -> x.getId() == id)
				.findFirst()
				.orElse(null);
				
		return emp != null;
	}
	
}


