package servFuncinalLambda;

import java.util.List;
import java.util.function.Predicate;

import entFuncionalLambda.product;

public class productService {

	
	public double filteredSum(List<product> list, Predicate<product> criteria) {
		double sum = 0.0;
	
		for (product p : list) {
		
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
	
		}
		return sum;
	}
	
}
