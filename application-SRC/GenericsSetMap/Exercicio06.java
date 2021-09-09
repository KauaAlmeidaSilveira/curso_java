package GenericsSetMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio06 {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		
		List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0);
		
		List<Object> objList = new ArrayList<>();
		
		copy(doubleList, objList);
		printList(objList);
		copy(intList, objList);
		printList(objList);
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source){
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
}
