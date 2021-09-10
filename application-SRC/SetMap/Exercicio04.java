package SetMap;

import java.util.Set;
import java.util.TreeSet;

import entSetMap.Product;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/* 
		 TreeSet ordena seus objetos atravez do compareTo, ent é necessario que o objeto implemente o comparable 
		*/
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}

	}

}
