package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();


	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem(OrderItem orderItems) {
		
		this.orderItem.add(orderItems);
		
	}
	
	public void removeItem(OrderItem orderItems) {
		
		this.orderItem.remove(orderItems);
		
	}
	
	public Double total() {
		double sum=0;
		
		for(OrderItem item : orderItem) {
			sum += item.subTotal();
		}
		
		return sum;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: ");
		sb.append(sdf.format(moment)+"\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append(client+ "\n");
		sb.append("Order Items: \n");
		for(OrderItem i : orderItem) {
			sb.append(i+"\n");
		}
		sb.append("Total price: ");
		sb.append(String.format("%.2f", total()));
		
		
		return sb.toString();
	}
	
}
