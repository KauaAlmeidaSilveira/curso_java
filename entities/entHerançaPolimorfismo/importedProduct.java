package entHerançaPolimorfismo;

public class importedProduct extends Product {

	private Double customsFee;

	public importedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return price+customsFee;
	}
	
	@Override
	public String toString() {
		return name + " $" + totalPrice() + " (Customs fee: $ "+ customsFee + ")";
	}
	
}
