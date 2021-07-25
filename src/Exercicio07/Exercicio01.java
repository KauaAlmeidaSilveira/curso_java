package Exercicio07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double crtl=0;
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			crtl += vect[i];
		}
		
		System.out.printf("A média das alturas é: %.2f%n", (crtl/n));
		
		
		
		
		
		
		sc.close();
	}

}
