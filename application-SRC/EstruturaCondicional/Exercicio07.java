package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		
		System.out.println("Digite um valor x: ");
		x = sc.nextDouble();
		
		System.out.println("Digite um valor y: ");
		y = sc.nextDouble();
		
		if(x>0 && y>0) {
			System.out.println("Q1");
		}else if(x<0 && y>0) {
			System.out.println("Q2");
		}else if(x<0 && y<0) {
			System.out.println("Q3");
		}else if(x>0 && y<0) {
			System.out.println("Q4");
		}else if(x==0 && y>=0) {
			System.out.println("Origem");
		}else {
			System.out.println("Valor incoerente!!");
		}
		
		sc.close();
	}

}
