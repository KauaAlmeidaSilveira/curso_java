package FuncionalLambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entFuncionalLambda.product;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		Integer sum = 0;
		double prices = 0.0;
		
		List<product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				
				String fields[] = line.split(",");
				list.add(new product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
				sum += 1;
				
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}

		for(product p : list) {
			prices += p.getPrice();
		}
		
		double media = prices/sum;
		
		System.out.println("Average price: " + String.format("%.2f", media));
		
		Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		
		List<String> names = list.stream()
				.filter(x -> x.getPrice() < media)
				.map(x -> x.getName())
				.sorted(comp.reversed())
				.collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
		sc.close();
	}

}
