package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int vlr= 0;

		System.out.println("Digite um valor: ");
		vlr = sc.nextInt();

		if (vlr % 2 == 0) {
			System.out.println("Este valor é par!!");
		} else {
			System.out.println("Este valor é impar!!");
		}
	
		sc.close();
	}

}
