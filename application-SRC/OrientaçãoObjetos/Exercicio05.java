package Orienta��oObjetos;

import java.util.Scanner;

import entOrienta��oObjetos.student;

public class Exercicio05 {

	public static void main(String[] args) {
		// ENTITIES STUDENT
		
		Scanner sc = new Scanner(System.in);
		student stud = new student();
		
		System.out.println("Digite o nome do aluno: ");
		stud.name = sc.next();
		
		System.out.println("Digite a nota final do 1� trimestre: ");
		stud.n1 = sc.nextDouble();
		
		System.out.println("Digite a nota final do 2� trimestre: ");
		stud.n2 = sc.nextDouble();
		
		System.out.println("Digite a nota final do 3� trimestre: ");
		stud.n3 = sc.nextDouble();
		
		System.out.println("");
		
		System.out.println("Nota Final: "+stud.nFinal());
		
		if(stud.crtl == 0) {
			
			System.out.println("REPROVADO!");
			
			double varCrtl = 60 - stud.nFinal();
			
			System.out.println("Faltou: "+ varCrtl);
		}else {
			System.out.println("APROVADO!");
		}
				
		sc.close();
	}

}
