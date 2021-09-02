package Interfaces;

import entEnums.Color;
import entInterfaces.rectangle;
import entInterfaces.Shape;
import entInterfaces.circle;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Shape s1 = new rectangle(Color.BLACK, 3.00, 4.00);
		
		Shape s2 = new circle(Color.BLUE, 2.0);
		
		System.out.println("Circle color: " + s2.getColor());
		System.out.println("Circle area: " + String.format("%.2f", s2.area()));
		System.out.println("Rectangle color: " + s1.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", s1.area()));
		
		
	}

}
