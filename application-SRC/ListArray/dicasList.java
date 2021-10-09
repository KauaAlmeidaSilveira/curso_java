package ListArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class dicasList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Mariana");
		list.add("jao");
		list.add("kaua");
		list.add("leandro");
		list.add("kaue");
		list.add(2, "Gleice");
		list.add("Marcos");
		
		System.out.println("Tamanho Lista: "+ list.size());
		
		for(String names : list) {
			System.out.println(names);
		}
		
		System.out.println("------------");
		
		list.removeIf(x -> x.charAt(0) == 'k');
		
		System.out.println("Tamanho Lista: "+ list.size());
		
		for(String names : list) {
			System.out.println(names);
		}
		
		System.out.println("------------------------");
		
		System.out.println(list.get(0));
		System.out.println("Index of kaua: "+ list.indexOf("kaua"));
		System.out.println("Index of jubileu: "+ list.indexOf("jubileu"));
		
		System.out.println("-------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'k').collect(Collectors.toList());
		
		for(String names : result) {
			System.out.println(names);
		}
		
		System.out.println("-------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		
		System.out.println(name);
	}

}
