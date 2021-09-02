package Interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio05 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		List<String> list = new ArrayList<>();
		
		String path = "C:\\Users\\kauaa\\Desktop\\Tudo\\Programação\\WorkSpace\\curso_java\\Arquivo\\names.csv";

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String name = br.readLine();
			while(name != null) {
				list.add(name);
				name = br.readLine();
			}
			
			Collections.sort(list); //Serve para ordenar os dados em ordem alfabetica
			
			for(String names : list) {
				System.out.println(names);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
