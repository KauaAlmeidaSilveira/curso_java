package FuncionalLambda;

import java.util.Comparator;

import entFuncionalLambda.product;

public class MyComparator implements Comparator<product>{

	@Override
	public int compare(product p1, product p2) {
		
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	
	}

}
