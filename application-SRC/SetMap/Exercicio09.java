package SetMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> candidatos = new HashMap<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				
				String name = fields[0];
				
				Integer votos = Integer.parseInt(fields[1]);
				
				if(candidatos.containsKey(name)) {
					Integer amount = candidatos.get(name);
					candidatos.put(name, votos + amount);
				}else {
					candidatos.put(name, votos);
				}
				
				line = br.readLine();
				
			}
			
			for(String key : candidatos.keySet()) {
				System.out.println(key +": "+ candidatos.get(key));
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
		
		
		
		sc.close();

	}

}
