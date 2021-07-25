package Exercicio01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a,b,c,d,cal;
		
		System.out.println("Digite quatro valores: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		cal = (a*b) - (c*d);
		
		System.out.print("Resultado da diferença do produto de A e B pelo produto de C e D: "+ cal);
		
		
		
		sc.close();
	}

}
