package EstruturaRepetitivaFor;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		int fat = 1;
		
		for (int i=1; i<=x; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
