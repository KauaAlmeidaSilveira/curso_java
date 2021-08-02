package entities;

public class products {

	private String name_pro;
	private Double price;
	
	public products() {

	}

	public products(String name_pro, Double price) {
		this.name_pro = name_pro;
		this.price = price;
	}

	public String getName_pro() {
		return name_pro;
	}

	public void setName_pro(String name_pro) {
		this.name_pro = name_pro;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product name: "+name_pro+", Product price: "+price;  
	}
	
}
