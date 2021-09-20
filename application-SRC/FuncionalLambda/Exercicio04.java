package FuncionalLambda;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Collectors;

import entFuncionalLambda.product;

public class Exercicio04 {

	public static void main(String[] args) {
		
		List<product> list = new ArrayList<>();
		
		list.add(new product("TV", 900.00));
		list.add(new product("HD Case", 80.90));
		list.add(new product("Tablet", 350.50));
		list.add(new product("Mouse", 50.00));
		
		//FORMAS DE MODIFICAR
		
		//Function<product, String> func = p -> p.getName().toUpperCase();
		
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//List<String> names = list.stream().map(product::staticUpperCaseName).collect(Collectors.toList());
		
		//List<String> names = list.stream().map(product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
