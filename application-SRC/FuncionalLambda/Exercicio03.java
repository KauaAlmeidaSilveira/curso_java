package FuncionalLambda;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;

import entFuncionalLambda.product;

public class Exercicio03 {

	public static void main(String[] args) {
		
		List<product> list = new ArrayList<>();
		
		list.add(new product("TV", 900.00));
		list.add(new product("HD Case", 80.90));
		list.add(new product("Tablet", 350.50));
		list.add(new product("Mouse", 50.00));
		
		//FORMAS DE MODIFICAR
		
		//Consumer<product> cons = p -> p.setPrice(p.getPrice()*1.1);
		
		//list.forEach(new productConsumer());
		
		//list.forEach(product::staticPriceUp);
		
		//list.forEach(product::nonStaticPriceUp);
		
		//list.forEach(cons);
		
		//list.forEach(p -> p.setPrice(p.getPrice()*1.1));
		
		list.forEach(System.out::println);
		
	}

}
