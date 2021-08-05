package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vlr;

		System.out.println("Digite um valor: ");
		vlr = sc.nextInt();

		if (vlr < 0) {
			System.out.println("Este valor é negativo!!");
		} else {
			System.out.println("Este valor é positivo!!");
		}

		sc.close();
	}

}
