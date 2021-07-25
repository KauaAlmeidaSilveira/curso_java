package Exercicio04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		
		for(int i=1; i<=x; i++) {
			
			if(i % 2 != 0){
				System.out.println(i);
			}
			
		}

		sc.close();
	}

}
