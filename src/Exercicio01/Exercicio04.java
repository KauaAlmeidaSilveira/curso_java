package Exercicio01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double numF,hT,vlrH,slr;
		
		System.out.println("Digite o numero do funcionário: ");
		numF = sc.nextDouble();
		
		System.out.println("Digite o numero de horas trabalhadas desse funcionário: ");
		hT = sc.nextDouble();
		
		System.out.println("Digite o valor da hora desse funcionário: ");
		vlrH = sc.nextDouble();
		
		slr = hT*vlrH;
		
		System.out.print("Numero do funcionário: "+ numF + "\nSalário do funcionário: R$"+ slr);
		
		
		
		sc.close();
	}

}
