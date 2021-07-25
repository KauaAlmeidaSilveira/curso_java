package Exercicio04;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		
		for(int i=1; i<=x;i++) {
			
			double y=x;
			
			if(y % i == 0){
				System.out.println(y/i);
			}
			
			
		}
		
		
		
		
		
		sc.close();
	}

}
