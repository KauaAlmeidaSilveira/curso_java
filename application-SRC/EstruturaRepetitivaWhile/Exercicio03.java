package EstruturaRepetitivaWhile;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int comb,alc=0,gaso=0,die=0;
		
		System.out.println("Qual combustivel você prefere?(1.Álcool 2.Gasolina 3.Diesel 4.Nenhum)");
		comb = sc.nextInt();
		
		while (comb != 4) {
			
			if (comb == 1) {
				alc = alc + 1;
			}
			else if (comb == 2) {
				gaso = gaso + 1;
			}
			else if (comb == 3) {
				die = die + 1;
			}
			
			comb = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gaso);
		System.out.println("Diesel: " + die);		
		
		sc.close();

	}

}
