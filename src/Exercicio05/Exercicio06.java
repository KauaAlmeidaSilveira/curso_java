package Exercicio05;

import java.util.Scanner;

import entities.converter;

public class Exercicio06 {

	public static void main(String[] args) {
		// ENTITIES CONVERTER
		
		Scanner sc = new Scanner(System.in);
		converter conver = new converter();
		
		System.out.println("Qual o preço do dolar atual ?");
		conver.price = sc.nextDouble();
		
		System.out.println("Qual quantidade deseja comprar ?");
		conver.quantity = sc.nextDouble();
		
		System.out.println("Para comprar essa quantidade, sera necessario R$ "+conver.convert());

		sc.close();
	}

}
