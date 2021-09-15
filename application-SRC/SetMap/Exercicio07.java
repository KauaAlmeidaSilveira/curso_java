package SetMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//HashMap - mais rapido e não ordenado
		//TreeMap - mais lento e ordenado pelo compareTo do objeto
		//LikedHashMap - velocidade media e elementos na ordem em que são adicionados
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Username", "maria");
		
		cookies.put("Email", "maria@gmail.com");
		
		cookies.put("Phone", "963689880");
		
		cookies.remove("Email");
		
		cookies.put("Phone", "947473977");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("Phone"));
		
		System.out.println("Phone number: " + cookies.get("Phone"));
		
		System.out.println("Email: " + cookies.get("email"));
		
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All cookies: ");
		
		for(String key : cookies.keySet()) {
			System.out.println(key+": "+ cookies.get(key));
		}
		

	}

}
