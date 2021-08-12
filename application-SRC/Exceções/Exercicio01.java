package Exceções;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
	method2();
	
	
	System.out.println();
	
	System.out.println("End of program!!");	
	

	}

	public static void method2() {
		
		System.out.println("METHOD 2 START");
		
		Scanner sc = new Scanner(System.in);
		
		try{	
			
			
			String[] vect = sc.nextLine().split(" ");
			
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
			
			
			}	
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid position!!");
			}
			catch(InputMismatchException e) {
				System.out.println("Input error!!");
			}
	
		sc.close();
	}
	
}
