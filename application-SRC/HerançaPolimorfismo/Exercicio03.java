package HerançaPolimorfismo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entHerançaPolimorfismo.Product;
import entHerançaPolimorfismo.importedProduct;
import entHerançaPolimorfismo.usedProduct;

public class Exercicio03 {

	public static void main(String[] args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> listP = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Product #"+ (i+1) +" data:");
		
			System.out.print("New, used or imported (n/u/i)?");
			String crtl = sc.next();
			
			if(crtl.equals("n")) 
			{
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				
				Product pro = new Product(name, price);
				
				listP.add(pro);	
			}
			else if(crtl.equals("u")) 
			{
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				
				System.out.print("ManuFacture Date (dd/mm/yyyy): ");
				Date manuFactureDate = sdf.parse(sc.next());
				
				Product pro = new usedProduct(name, price, manuFactureDate);
				
				listP.add(pro);
			}
			else 
			{
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				Product pro = new importedProduct(name, price, customsFee);
				
				listP.add(pro);
			}
			
			
		}
		
		System.out.println();
		
		System.out.println("PRICE TAGS: ");
		
		for(Product p : listP) {
			System.out.println(p);
		}
		
		sc.close();
	}

}
