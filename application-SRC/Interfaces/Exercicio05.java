package Interfaces;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entInterfaces.Funcionarios;

public class Exercicio05 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		List<Funcionarios> list = new ArrayList<>();
	
		String path = "C:\\Users\\kauaa\\Desktop\\Tudo\\Programação\\WorkSpace\\curso_java\\Arquivo\\funcionarios.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String FuncionarioCsv = br.readLine();
			
			while(FuncionarioCsv != null) {
				String[] fields = FuncionarioCsv.split(",");
				
				list.add(new Funcionarios(fields[0], Double.parseDouble(fields[1])));
				
				FuncionarioCsv = br.readLine();
			}
			
			Collections.sort(list); //Serve para ordenar os dados em ordem alfabetica
			
			for(Funcionarios func : list) {
				System.out.println(func.getName()+", "+func.getSalary());
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
