package Interfaces;

import entInterfaces.ComboDevice;
import entInterfaces.ConcretePrinter;
import entInterfaces.ConcreteScanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My Letter");
		
		System.out.println();

		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: "+ s.scan());
	
		System.out.println();
		
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Combo scan result: " + c.scan());
		
	}

}
