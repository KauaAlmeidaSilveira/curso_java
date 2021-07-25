package Exercicio02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ped,qnt,cod1,cod2,cod3,cod4,cod5;
		
		double pedido = 0;
		cod1 = 4;
		cod2 = 4.5;
		cod3 = 5;
		cod4 = 2;
		cod5 = 1.5;
		
		System.out.println("Digite o código do seu pedido: ");
		ped = sc.nextDouble();
		
		System.out.println("Digite o a quantidade que deseja: ");
		qnt = sc.nextDouble();
		
		if(ped==1) {
			pedido = cod1*qnt;
		}else if (ped==2) {
			pedido = cod2*qnt;
		}else if (ped==3) {
			pedido = cod3*qnt;
		}else if (ped==4) {
			pedido = cod4*qnt;
		}else if (ped==5) {
			pedido = cod5*qnt;
		}else {
			System.out.println("Pedido incoerente!!");
		}
		
		System.out.println("Total: R$"+ pedido);
		sc.close();
	}
	
}
