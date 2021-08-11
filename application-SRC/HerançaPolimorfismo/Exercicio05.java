package HerançaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entHerançaPolimorfismo.entity;
import entHerançaPolimorfismo.legalEntity;
import entHerançaPolimorfismo.physicsEntity;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<entity> list = new ArrayList<>();
		
		int x = 0;
		double sum=0;
		
		System.out.print("Enter the number of tax payers: ");
		int crtl = sc.nextInt();
		
		for(int i=0; i<crtl; i++) {
			
			System.out.println("Tax payers #"+(i+1)+" data:");
			System.out.print("Individual or company (i/c): ");
			char aux = sc.next().charAt(0);
			
			if(aux != 'i' && aux != 'c') {
				while(x == 0) {
					System.out.println("Dates incorrects, try again!!");
					
					System.out.print("Individual or company (i/c): ");
					aux = sc.next().charAt(0);
					
					if(aux == 'i' || aux == 'c') {
						x += 1;
					}
		
				}
			}
			
			
			if(aux == 'i') 
			{
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				
				System.out.print("Health Spending: ");
				double healthSpending = sc.nextDouble();
				
				physicsEntity phEnt = new physicsEntity(name, income, healthSpending);
				
				list.add(phEnt);
			}
			else if(aux == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				
				System.out.print("Number of employees: ");
				Integer numFunc = sc.nextInt();
				
				legalEntity leEnt = new legalEntity(name, income, numFunc);
				
				list.add(leEnt);
			}
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID: ");
		for(entity ent : list) {
			System.out.println(ent);
		}
		
		for(entity ent : list) {	
			sum+= ent.imp();
		}
		
		System.out.println();
		
		System.out.println("TOTAL TAXES: $"+ sum);
		sc.close();
	}

}
