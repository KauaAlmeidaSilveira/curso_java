package Exercicio04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int in=0,out=0;
		
		int y = sc.nextInt();
		
		for(int i=1; i<=y; i++) {
			
			double x = sc.nextDouble();
			
			if(x>=10 && x<=20) {
				in+=1;
			}else {
				out+=1;
			}
			
		}
		
		System.out.println(in+" in\n"+out+" out");
		
		sc.close();
	}

}
