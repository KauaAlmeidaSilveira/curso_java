package TrabalhandoComArquivos;

import java.io.File;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("GetName: "+ path.getName());
		
		System.out.println("GetParent: "+ path.getParent());
		
		System.out.println("GetPath: "+ path.getPath());
		
		
		sc.close();
	}

}
