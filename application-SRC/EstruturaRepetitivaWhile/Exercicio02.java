package EstruturaRepetitivaWhile;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x =0;
		int y = 0;
		
		System.out.println("Digite o valor de x: ");
		x = sc.nextInt();
		
		System.out.println("Digite o valor de y: ");
		y = sc.nextInt();
		
		while (x != 0) {
			
			if(y==0) {
				x=0;
			}
			
			if(x>0 && y>0) {
				System.out.println("Q1");
				break;
			}else if (x<0 && y>0) {
				System.out.println("Q2");
				break;
			}else if (x<0 && y<0) {
				System.out.println("Q3");
				break;
			}else if (x>0 && y<0) {
				System.out.println("Q4");
				break;
			}
			
		}
		
		
		sc.close();

	}

}
