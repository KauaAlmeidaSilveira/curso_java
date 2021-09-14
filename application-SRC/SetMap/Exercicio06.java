package SetMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entSetMap.alunos;

public class Exercicio06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Set<alunos> setA = new TreeSet<>();
		
		Set<alunos> setB = new TreeSet<>();
		
		Set<alunos> setC = new TreeSet<>();
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		
		for(int i=0; i<a ; i++) {
			
			Integer id = sc.nextInt();
			
			setA.add(new alunos(id));
		}
		
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		
		for(int i=0; i<b ; i++) {
			
			Integer id = sc.nextInt();
			
			setB.add(new alunos(id));
		}
		
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		
		for(int i=0; i<c ; i++) {
			
			Integer id = sc.nextInt();
			
			setC.add(new alunos(id));
		}
		
		Set<alunos> setD = new TreeSet<>(setA);
		
		setD.addAll(setB);
		
		setD.addAll(setC);
		
		
		System.out.println("Total users: " + setD.size());
		
		sc.close();

	}

}
