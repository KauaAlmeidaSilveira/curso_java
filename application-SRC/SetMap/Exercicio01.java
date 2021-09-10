package SetMap;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/* 
		 TIPOS DE SET: HashSet(mais rapido e não ordenado), TreeSet(mais lento e ordenado) e LinkedHashSet(velocidade media e elementos
		na ordem em que são adicionados)
		*/
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3);
		//set.removeIf(x -> x.charAt(0) == 'T');
		
		for(String s : set) {
			System.out.println(s);
		}

	}

}
