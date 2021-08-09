package entHerançaPolimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class usedProduct extends Product{

	
	private Date manuFactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public usedProduct(String name, Double price, Date manuFactureDate) {
		super(name, price);
		this.manuFactureDate = manuFactureDate;
	}
	
	@Override
	public String toString() {
		return name +" (used) " + " $" + price + " (ManuFacture Date: "+ sdf.format(manuFactureDate)+")";
	}
	
}
