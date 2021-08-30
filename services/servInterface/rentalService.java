package servInterface;

import entInterfaces.Invoice;
import entInterfaces.carRental;

public class rentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private brazilTaxService brTax;
	
	
	public rentalService() {
		
	}


	public rentalService(Double pricePerHour, Double pricePerDay, brazilTaxService brTax) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.brTax = brTax;
	}


	public Double getPricePerHour() {
		return pricePerHour;
	}


	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}


	public Double getPricePerDay() {
		return pricePerDay;
	}


	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}


	public brazilTaxService getBrTax() {
		return brTax;
	}


	public void setBrTax(brazilTaxService brTax) {
		this.brTax = brTax;
	}
	
	public void processInvoice(carRental carRental) {
		
		long t1 = carRental.getStart().getTime();
		
		long t2 = carRental.getFinish().getTime();
		
		double hours = (double) (t2-t1) / 1000 / 60 / 60;
		
		double basicPayment;
		
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours)*pricePerHour;
		}else {
			basicPayment = Math.ceil(hours / 24)*pricePerDay;
		}
		
		double tax = brTax.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
	
	
}
