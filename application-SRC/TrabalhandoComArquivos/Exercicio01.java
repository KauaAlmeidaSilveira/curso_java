package TrabalhandoComArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\kauaa\\Desktop\\Tudo\\Programação\\WorkSpace\\curso_java\\Arquivo\\in.csv");
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
			
		}
		
	}

}
