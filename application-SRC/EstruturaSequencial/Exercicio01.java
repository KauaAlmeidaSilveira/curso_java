package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x,y,cal;
		
		System.out.println("Digite o 1� valor: ");
		x = sc.nextDouble();
		
		System.out.println("Digite o 2� valor: ");
		y = sc.nextDouble();
		
		cal = x+y;
		
		System.out.println("Soma dos valores "+ x + " + " + y + ": "+ cal);
		
		sc.close();
	}

}
