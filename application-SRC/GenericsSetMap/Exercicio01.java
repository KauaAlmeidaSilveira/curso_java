package GenericsSetMap;

import java.util.Scanner;

import servGerericsSetMap.printService;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values? ");
		
		int n = sc.nextInt();
		
		printService<String> ps = new printService<>();
		
		for(int i=0; i<n ; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		
		System.out.println("");
		
		System.out.println("First: "+ ps.first());

		
		sc.close();
	}

}
