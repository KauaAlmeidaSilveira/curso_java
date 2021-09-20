package FuncionalLambda;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;

import entFuncionalLambda.product;

public class Exercicio02 {

	public static void main(String[] args) {
		
		List<product> list = new ArrayList<>();
		
		list.add(new product("TV", 900.00));
		list.add(new product("HD Case", 80.90));
		list.add(new product("Tablet", 350.50));
		list.add(new product("Mouse", 50.00));
		
		//FORMAS DE REMOVER
		
		//Predicate<product> pred = p -> p.getPrice() >= 100.0;
		
		//list.removeIf(p -> p.getPrice() >= 100 );
		
		//list.removeIf(new productPredicate());
		
		//list.removeIf(product::staticProductPredicate );
		
		//list.removeIf(product::nonStaticProductPredicate);
		
		//list.removeIf(pred);
		
		
		list.forEach(System.out::println);

	}

}
