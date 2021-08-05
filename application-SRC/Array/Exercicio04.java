package Array;

public class Exercicio04 {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Kaua","Leandro","Gleice"};

		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------------------");
		
		for(String names : vect) {
			System.out.println(names);
		}
		
	}

}
