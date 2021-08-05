package entOrientaçãoObjetos;

public class functionary {

	public String name;
	public double slrG;
	public double imp;
	
	
	public double slrN() {
		
		double slr = slrG;
		
		slr -= (slr*(imp/100));
		
		return slr;
	}
	
	public void aumenSlr (double porcem) {
		
		slrG = slrG*((porcem/100)+1);
		
	}
	
}
