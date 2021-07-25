package Exercicio02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double vlr= 0;

		System.out.println("Digite um valor: ");
		vlr = sc.nextDouble();
		
		if (vlr >= 0 && vlr <=25) {
			System.out.println("Este valor se encontra no intervalo [0,25]");
		}else if (vlr >= 25.01 && vlr <= 50) {
			System.out.println("Este valor se encontra no intervalo [25,50]");
		}else if (vlr >= 50.01 && vlr <= 75) {
			System.out.println("Este valor se encontra no intervalo [50,75]");
		}else if (vlr >= 75.01 && vlr <= 100) {
			System.out.println("Este valor se encontra no intervalo [75,100]");
		}else {
			System.out.println("Este valor não se encontra em intervalo algum!!");
		}
		
		sc.close();
	}

}
