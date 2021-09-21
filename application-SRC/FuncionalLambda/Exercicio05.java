package FuncionalLambda;

import java.util.ArrayList;
import java.util.List;

import entFuncionalLambda.product;
import servFuncinalLambda.productService;

public class Exercicio05 {

	public static void main(String[] args) {

		List<product> list = new ArrayList<>();
		
		list.add(new product("TV", 900.00));
		list.add(new product("HD Case", 80.90));
		list.add(new product("Tablet", 350.50));
		list.add(new product("Mouse", 50.00));
		
		productService ps = new productService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
