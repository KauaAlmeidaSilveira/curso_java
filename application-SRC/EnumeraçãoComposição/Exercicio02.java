package EnumeraçãoComposição;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entEnumeraçãoComposição.WorkerLevel;
import entEnumeraçãoComposição.Department;
import entEnumeraçãoComposição.HourContract;
import entEnumeraçãoComposição.Worker;

public class Exercicio02 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String name_dep = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Enter worker data: ");
		
		System.out.println();
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.nextLine();
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker func = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(name_dep));
		
		System.out.print("How many contracts to this worker? ");
		int qnt_contract = sc.nextInt();
		
		for(int i=0; i<qnt_contract; i++) {
			
			System.out.println();
			
			System.out.println("Enter contract #"+(i+1)+" data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double valPerH = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contracts = new HourContract(date, valPerH, hours);
			func.addContract(contracts);
			
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		
		System.out.println(func);
		System.out.println("Income for "+ monthAndYear+": "+ func.income(year, month));
		
		sc.close();
	}

}
