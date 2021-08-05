package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double inicio;
		double fim;
		double total=0;
		System.out.println("Digite a hora em que o jogo começou: ");
		inicio = sc.nextDouble();
		
		System.out.println("Digite a hora em que o jogo terminou: ");
		fim = sc.nextDouble();
		
		if ( inicio < fim) {
			
			total = fim - inicio;
		
		}else {
			total = 24 - inicio + fim;
		}
		
		
		System.out.println("Seu jogo durou: "+ total + "h");
		
		sc.close();
	}

}
