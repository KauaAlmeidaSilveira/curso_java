package Exercicio02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int vlr01= 0;
		int vlr02= 0;
		
		
		System.out.println("Digite um 1º valor: ");
		vlr01 = sc.nextInt();

		System.out.println("Digite um 2º valor: ");
		vlr02 = sc.nextInt();
		
		if (vlr02 > vlr01) {
			int aux;
			aux = vlr02;
			vlr02 = vlr01;
			vlr01 = aux;
		}
		
		if (vlr01 % vlr02 == 0 ) 
		{
			
			System.out.println("São Multiplos!!");
		
		} else 
		{
			System.out.println("Não são multiplos!!");
		
		}
	
		sc.close();
	}

}
