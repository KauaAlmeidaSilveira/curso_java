package SetMap;

import java.util.HashSet;
import java.util.Set;

import entSetMap.Product;

public class Exercicio03 {

	public static void main(String[] args) {

		/* 
		 O HashSet compara seus elementos desde que o objeto contenha os metodos hashcode e equals, se não ele compara
		 as referencias daquele objeto!!
		*/
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
