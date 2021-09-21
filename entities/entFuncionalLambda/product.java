package entFuncionalLambda;

public class product {

	private String name;
	private Double price;
	
	public product() {
		
	}
	
	public product(String name, Double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(product p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}
	
	public static void staticPriceUp(product p) {
		p.setPrice(p.getPrice()*1.1);
	}
	
	public void nonStaticPriceUp() {
		price = price *1.1;
	}
	
	public static String staticUpperCaseName(product p) {
		return p.getName().toUpperCase();
	}
	
	public  String nonStaticUpperCaseName( ) {
		return name.toUpperCase();
	}
	
	 @Override
	public String toString() {
		return "Name: "+ name + ", price: "+ String.format("%.2f", price);
	}
	
}
