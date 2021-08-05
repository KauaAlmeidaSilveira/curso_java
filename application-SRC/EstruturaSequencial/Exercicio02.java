package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double r,area;
		double pi = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		r = sc.nextDouble();	
		
		area = pi * Math.pow(r,2);
		
		System.out.printf("Area: %.4f", area);
		

		sc.close();

	}

}
