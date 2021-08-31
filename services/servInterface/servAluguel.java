package servInterface;

import entInterfaces.aluguelCarro;
import entInterfaces.fatura;

public class servAluguel {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public servAluguel(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processFatura(aluguelCarro aluguelCarro) {
		
		long dateStart = aluguelCarro.getStart().getTime();
		long dateFinish = aluguelCarro.getFinish().getTime();
		
		double hours = (double) (dateFinish - dateStart) / 1000 / 60 / 60;
		
		double basicPayment;
		
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours)*pricePerHour;
		}else {
			basicPayment = Math.ceil(hours/24)*pricePerDay;
		}
		
		double tax = taxService.tax(basicPayment);
		
		aluguelCarro.setFatura(new fatura(basicPayment, tax));
		
	}
	
}
