package entOrientaçãoObjetos;

public class student {

	public String name;
	public double n1;
	public double n2;
	public double n3;
	public double sumN;
	public int crtl;
	
	public double nFinal() {
		sumN = n1+n2+n3;
		return sumN;
	}
	
	public void result() {
		if((sumN) < 60) {
			crtl = 0; 
		}else {
			crtl = 1;
		}
	}

	
	
	
}
