package OrientaçãoObjetos;

import java.util.Scanner;

import entOrientaçãoObjetos.rectangle;

public class Exercicio03 {

	public static void main(String[] args) {
		// ENTITIES RECTANGLE
		
		Scanner sc = new Scanner(System.in);
		rectangle rectangle = new rectangle();

		System.out.print("Write the width of rectangle: ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Write the height of rectangle: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area: "+rectangle.area()+"\nPerimeter: "+rectangle.perimetro()+"\nDiagonal: "+rectangle.diagonal());
		
		sc.close();
	}

}
