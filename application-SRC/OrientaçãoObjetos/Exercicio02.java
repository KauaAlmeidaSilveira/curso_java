package OrientaçãoObjetos;

import java.util.Scanner;

import entOrientaçãoObjetos.product;

public class Exercicio02 {

	public static void main(String[] args) {
		// ENTITIES - PRODUCT
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Product data");
		
		System.out.println("");
		
		System.out.print("Write the name of product: ");
		String name = sc.next();
		
		
		System.out.print("Write the price of product: ");
		double price = sc.nextDouble();
		
		System.out.print("Write the quantity you want add: ");
		int quantity = sc.nextInt();
		
		product product = new product(name,price,quantity);
		
		System.out.println("");
		
		System.out.println("Product data: "+ product.getName()+", R$ "+ product.getPrice()+
							", units "+ product.getQuantity()+", R$ "+ product.valueAll());
		
		System.out.println("");
		 
		System.out.print("Write the quantity you want to add: ");
		int addPro = sc.nextInt();
		product.addProducts(addPro);
		
		System.out.println("");
		
		System.out.println("Product data: "+ product.getName()+", R$ "+ product.getPrice()+
				", units "+ product.getQuantity()+", R$ "+ product.valueAll());
		
		System.out.println("");
		
		System.out.println("Write the quantity you want to remove: ");
		int revPro = sc.nextInt();
		product.revProducts(revPro);
		
		System.out.println("");
		
		System.out.println("Product data: "+ product.getName()+", R$ "+ product.getPrice()+
				", units "+ product.getQuantity()+", R$ "+ product.valueAll());
		
		
		sc.close();
	}

}
