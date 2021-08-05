package OrientaçãoObjetos;

import java.util.Scanner;

import entOrientaçãoObjetos.triangle;

public class Exercicio01 {

	public static void main(String[] args) {
		// ENTITIES - TRIANGLE
		
		Scanner sc = new Scanner(System.in);
		
		triangle x, y;
		
		x = new triangle();
		y = new triangle();
		
		System.out.println("Write the base(cm) of triangle x: ");
		x.base = sc.nextDouble();
		
		System.out.println("Write the height(cm) of triangle x: ");
		x.altura = sc.nextDouble();
		
		System.out.println("The area(m²) of triangle x is: "+ x.area());
		
		System.out.println("");
		
		System.out.println("Write the base(cm) of triangle y: ");
		y.base = sc.nextDouble();
		
		System.out.println("Write the height(cm) of triangle y: ");
		y.altura = sc.nextDouble();
		
		System.out.println("");
		
		System.out.println("The area(m²) of triangle x is: "+ y.area());
		
		System.out.println("");
		
		if (y.area() > x.area()) {
			System.out.println("The area of triangle y is bigger");
		}else {
			System.out.println("The area of triangle x is bigger");
		}
		
		
		sc.close();
		
	}

}
