package TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entArquivos.Product;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> pro = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		
		String sourceFolderStr = sourceFile.getParent();
		
		@SuppressWarnings("unused")
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCsv = br.readLine();
			
			while(itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);
				
				pro.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();
			}
		
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				for(Product item : pro) {
					bw.write(item.getName()+", "+String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " CREATED!");
			}catch(IOException e) {
				System.out.println("Error writing file: "+ e.getMessage());
			}
		}catch(IOException e) {
			System.out.println("Error reading file: "+ e.getMessage());
		}
		
		sc.close();
	}

}
