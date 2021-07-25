package Exercicio01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double cod1,qnt1,vlr1,cod2,qnt2,vlr2,cal;
		
		System.out.print("Digite o código da peça 01: ");
		cod1 = sc.nextDouble();
		
		System.out.print("Digite a quantidade da peça 01: ");
		qnt1 = sc.nextDouble();
		
		System.out.print("Digite o valor da peça 01: ");
		vlr1 = sc.nextDouble();
		
		System.out.print("Digite o código da peça 02: ");
		cod2 = sc.nextDouble();
		
		System.out.print("Digite a quantidade da peça 02: ");
		qnt2 = sc.nextDouble();
		
		System.out.print("Digite o valor da peça 02; ");
		vlr2 = sc.nextDouble();
		
		cal = (qnt1*vlr1)+(qnt2*vlr2);
		
		System.out.print("Peça 01: "+ cod1 +"\nPeça 02: "+cod2+"\nValor total: "+ cal);
		
		
		sc.close();
	}

}
