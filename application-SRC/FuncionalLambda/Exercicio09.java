package FuncionalLambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entFuncionalLambda.functionary;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		List<functionary> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				
				String fields[] = line.split(",");
				
				list.add(new functionary(fields[0], fields[1], Double.parseDouble(fields[2])));
				
				line = br.readLine();
				
			}
			
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.print("Enter salary: ");
		double auxSlr = sc.nextDouble();
		
		System.out.println("Email of people whose salary is more than "+auxSlr+":");
		
		List<String> emails = list.stream()
				.filter(f -> f.getSalary() > auxSlr)
				.map(f -> f.getEmail())
				.collect(Collectors.toList());
				
		emails.forEach(System.out::println);
		
		double totalSlr = 0.0;
		
		for(functionary f : list) {
			if(f.getName().charAt(0) == 'K') {
				totalSlr += f.getSalary();
			}
		}
		
		
		System.out.println("Sum of salary of people whose name starts with 'K' : "+ totalSlr);
		
		
		sc.close();
	}

}
