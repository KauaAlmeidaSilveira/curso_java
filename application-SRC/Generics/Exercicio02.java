package Generics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entGenerics.Product;
import servGererics.CalculationService;

public class Exercicio02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\kauaa\\Desktop\\Tudo\\Programação\\WorkSpace\\curso_java\\Arquivo\\exer02.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive: "+ x);

			
		} catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
		
		
		sc.close();
	}

}
