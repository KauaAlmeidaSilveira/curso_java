package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double vlr1=0,vlr2=0;
		
		for(int i=0; i<=x; i++) {
			vlr1 = sc.nextDouble();
			vlr2 = sc.nextDouble();
			
			if(vlr2==0) {
				System.out.println("Divisão Impossivel!!");
			}else {
				System.out.println(vlr1/vlr2);
			}
			
		}
		
		
		
		sc.close();
	}

}
