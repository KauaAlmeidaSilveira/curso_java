package FuncionalLambda;

import java.util.function.Consumer;

import entFuncionalLambda.product;

public class productConsumer implements Consumer<product>{

	@Override
	public void accept(product p) {

		p.setPrice(p.getPrice()*1.1);
		
	}

}
