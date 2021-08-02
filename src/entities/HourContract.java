package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valPerH;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valPerH, Integer hours) {
		this.date = date;
		this.valPerH = valPerH;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValPerH() {
		return valPerH;
	}

	public void setValPerH(Double valPerH) {
		this.valPerH = valPerH;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valPerH*hours;
	}
	
	
}
