package Array;

import java.util.Scanner;

import entArray.rent;

public class Exercicio03 {

	public static void main(String[] args) {
		// ENTITIES RENT

		Scanner sc = new Scanner(System.in);

		int n =1;
		int y =0;
		
		System.out.println("Quantos quartos deseja alugar?");
		int x = sc.nextInt();
		
		rent[] vect = new rent[10];
		
		
		for(int i=0; i<x; i++) {

			System.out.println("");
			
			System.out.println("Rent "+ (i+1));
			
			System.out.println("");
			
			System.out.print("Digite seu nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Digite seu email: ");
			String email = sc.nextLine();
			
			System.out.print("Digite o numero do quarto que deseja alugar: ");
			int numQ = sc.nextInt();
			
			if(vect[numQ] == null) {
				vect[numQ] = new rent(name,email,numQ);
			}else{
				while(n==1) {
					System.out.println("");
					System.out.print("Quarto já ocupado escolha outro: ");
					y = sc.nextInt();
					
					if (y != numQ) {
						vect[y] = new rent(name,email,numQ);
						n=0;
					}
				}
			}
		}
		System.out.println("");
		System.out.println("Rents");	
		
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				
				System.out.println(i+": "+ vect[i]);
			}
			
		}
		
		
		
		sc.close();
	}

}
