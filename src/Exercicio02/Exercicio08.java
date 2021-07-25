package Exercicio02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double slr=0;
		
		System.out.println("Digite seu salário: ");
		slr = sc.nextDouble();
		
		if(slr>=0 && slr<=2000) {
			System.out.println("Imposto isento!!");
		}else if(slr>=2000.01 && slr<=3000) {
			System.out.println("Imposto: R$"+ (1000*0.08));
		}else if(slr>=3000.01 && slr<=4500) {
			System.out.println("Imposto: R$"+ (1000*0.18));
		}else if(slr>4500) {
			System.out.println("Imposto: R$"+ (1000*0.28));
		}
		
		
		
		
		
		sc.close();
	}

}
