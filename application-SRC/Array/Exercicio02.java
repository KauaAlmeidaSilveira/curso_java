package Array;

import java.util.Scanner;

import entOrienta��oObjetos.product;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double crtl=0;

		product[] vect = new product[n];
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Digite o "+ i +"� nome: ");
			String name = sc.next();
			
			System.out.print("Digite o pre�o: R$ ");
			Double price = sc.nextDouble();
			
			vect[i] = new product(name, price);
			
			if(i==(n-1)) {
				for(int i2=0; i2<n; i2++) {
					crtl += vect[i2].getPrice();
				}
				System.out.println("");
				System.out.printf("M�dia dos pre�os: R$ %.2f%n", (crtl/n));
			}
			
		}
		
		
		
		
		
		sc.close();
	}

}
