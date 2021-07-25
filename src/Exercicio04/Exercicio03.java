package Exercicio04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double result=0,vlr1=0,vlr2=0,vlr3=0;
		
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			vlr1 = sc.nextDouble();
			vlr2 = sc.nextDouble();
			vlr3 = sc.nextDouble();
			
			result=(vlr1*2+vlr2*3+vlr3*5)/(2+3+5);
			System.out.printf("%.1f%n",result);
		}
		
	
		
		
		sc.close();
	}

}
