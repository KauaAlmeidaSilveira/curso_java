package Exercicio01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double numF,hT,vlrH,slr;
		
		System.out.println("Digite o numero do funcion�rio: ");
		numF = sc.nextDouble();
		
		System.out.println("Digite o numero de horas trabalhadas desse funcion�rio: ");
		hT = sc.nextDouble();
		
		System.out.println("Digite o valor da hora desse funcion�rio: ");
		vlrH = sc.nextDouble();
		
		slr = hT*vlrH;
		
		System.out.print("Numero do funcion�rio: "+ numF + "\nSal�rio do funcion�rio: R$"+ slr);
		
		
		
		sc.close();
	}

}
