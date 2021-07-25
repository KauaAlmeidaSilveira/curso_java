package Exercicio05;

import java.util.Scanner;

import entities.functionary;



public class Exercicio04 {

	public static void main(String[] args) {
		// ENTITIES FUNCTIONARY
		
		Scanner sc = new Scanner(System.in);
		functionary func = new functionary();
		
		System.out.print("Write your name: ");
		func.name = sc.next();
		
		System.out.print("Write your gross salary: ");
		func.slrG = sc.nextDouble();
		
		System.out.print("Write the tax rate(%): ");
		func.imp = sc.nextDouble();
		
		System.out.println("Name: " + func.name+", R$ "+ func.slrN());
		
		System.out.println("");
		
		System.out.println("Which percentage to increase salary ?");
		double porcem = sc.nextDouble();
		func.aumenSlr(porcem);
		
		System.out.println("");
		
		System.out.print("Name: " + func.name+", R$ "+ func.slrN());
		
	
		sc.close();
	}

} 
