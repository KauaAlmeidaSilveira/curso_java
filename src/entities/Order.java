package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	Client cli = new Client();
	List<OrderItem> orderItems = new ArrayList<>();
	
	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client cli) {
		this.moment = moment;
		this.status = status;
		this.cli = cli;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCli() {
		return cli;
	}

	public void setCli(Client cli) {
		this.cli = cli;
	}

	public List<OrderItem> getOrderItem() {
		return orderItems;
	}

	public void addItem(OrderItem orderItem) {	
		orderItems.add(orderItem);	
	}
	
	public void removeItem(OrderItem orderItem) {	
		orderItems.remove(orderItem);	
	}
	
	public double total() {
		double soma = 0;
		
		for(OrderItem oI : orderItems) {
			soma += oI.subTotal();
		}
		
		return soma;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: ");
		sb.append(sdf.format(moment)+ "\n");
		sb.append("Order Status: ");
		sb.append(status+"\n");
		sb.append(cli+"\n");
		sb.append("Order items: \n");
		for(OrderItem oI : orderItems) {
			sb.append(oI+"\n");
		}
		sb.append("Total price: "+ total());
		
		return sb.toString();
	}
}
