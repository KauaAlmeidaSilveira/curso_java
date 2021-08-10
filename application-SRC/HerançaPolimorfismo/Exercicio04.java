package HerançaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entEnums.Color;
import entHerançaPolimorfismo.circle;
import entHerançaPolimorfismo.rectangle;
import entHerançaPolimorfismo.shape;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int crtl = sc.nextInt();
		
		for(int i=0; i<crtl ; i++) {
			
			System.out.println("Shape #"+(i+1)+" data:");
			
			System.out.print("Rectangle or Circle (r/c)?");
			char shape = sc.next().charAt(0);
			
			System.out.print("Color (red/black/blue): ");
			Color color = Color.valueOf(sc.next());
			
			if(shape == 'r') 
			{
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double heigth = sc.nextDouble();
				
				rectangle rec = new rectangle(color, width, heigth);
				
				list.add(rec);
			}
			else 
			{
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				circle cir = new circle(color, radius);
				
				list.add(cir);
			}
			
		}
		
		System.out.print("SHAPE AREAS: ");
		
		System.out.println();
		
		for(shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		
		sc.close();
	}

}
