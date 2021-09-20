package FuncionalLambda;

import java.util.ArrayList;
import java.util.List;

import entFuncionalLambda.product;

public class Exercicio01 {

	public static void main(String[] args) {
		
		List<product> list = new ArrayList<>();
		
		list.add(new product("TV", 900.00));
		list.add(new product("Notebook", 1200.00));
		list.add(new product("Tablet", 450.00));
		
		/*   SEM LAMBDA
		 
	 	Comparator<product> comp = new Comparator<product>() {
			@Override
			public int compare(product p1, product p2) {	
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}	
		};
		
		*/
		
		
		/*   COM LAMBDA
		
		 Comparator<product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		*/
		
		//MAIS SIMPLIFICADO
		//(p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())
		
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		list.forEach(System.out::println);
		
	}

}
