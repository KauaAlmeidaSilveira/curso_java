package SetMap;

import java.util.HashMap;
import java.util.Map;

import entSetMap.Product;

public class Exercicio08 {

	public static void main(String[] args) {
	
		Map<Product, Double> estoque = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		estoque.put(p1, 10000.0);
		
		estoque.put(p2, 20000.0);
		
		estoque.put(p3, 15000.0);

		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + estoque.containsKey(ps));
		
	}

}
