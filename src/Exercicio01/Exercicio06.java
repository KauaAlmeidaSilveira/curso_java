package Exercicio01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a,b,c,pi;
		
		pi= 3.14159;
		
		System.out.println("Digite o 1� valor: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o 2� valor: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o 3� valor: ");
		c = sc.nextDouble();
		
		System.out.println("�rea Trinangulo: "+ (a*c)/2);
		System.out.println("�rea do Circulo(pi=3,14159): "+ pi*Math.pow(c, 2));
		System.out.println("�rea do trapezio: "+ (a+b)*c/2);
		System.out.println("�rea do quadrado: "+ Math.pow(b, 2));
		System.out.println("�rea do retangulo: "+ a*b);
		
		
		sc.close();
	}

}
