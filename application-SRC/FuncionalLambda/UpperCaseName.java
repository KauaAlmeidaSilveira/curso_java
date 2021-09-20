package FuncionalLambda;

import java.util.function.Function;

import entFuncionalLambda.product;

public class UpperCaseName implements Function<product, String>{

	@Override
	public String apply(product p) {
		return p.getName().toUpperCase();
	}

}
