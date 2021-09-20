package FuncionalLambda;

import java.util.function.Predicate;

import entFuncionalLambda.product;

public class productPredicate implements Predicate<product>{

	@Override
	public boolean test(product p) {
		return p.getPrice() >= 100.0;
	}

}
