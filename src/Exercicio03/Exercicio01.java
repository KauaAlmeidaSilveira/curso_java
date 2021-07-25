package Exercicio03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Digite a senha: ");
		senha = sc.nextInt();
			
		while (senha != 2002) {
			
		System.out.println("Senha Invalida!!");
		
		System.out.println("Digite a senha novamente: ");
		senha = sc.nextInt();
		
		}
		
		if (senha == 2002) {
			System.out.println("Acesso Permitido!!");
		}
		
		sc.close();

	}

}
