package entOrientaçãoObjetos;

public class converter {

	public double price;
	public double quantity;
	public double imp=1.06;
	
	public double convert() {
		return (quantity*imp)*price;
	}
	
}
