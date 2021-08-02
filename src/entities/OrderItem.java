package entities;

public class OrderItem {

	private Integer quantity;
	
	private Double price;
	
	products pro = new products();
	
	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price, products pro) {

		this.quantity = quantity;
		this.price = price;
		this.pro = pro;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		
		return quantity*price;
		
	}
	
	@Override
	public String toString() {

		return "Name: "+ pro.getName_pro() + ", Price: $" + price +", Quantity: "+ quantity +", SubTotal: $"+ subTotal();
		
	}
}
