package EjemplosVarios;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class EjemplosDataStructures {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			linkedList.add(i);
		}

		//Averiguando el tercer elemento desde el final de la linkedList.
		System.out.println("Averiguando el tercer elemento desde el final de la linkedList.");
		Iterator<Integer> integerIterator = linkedList.descendingIterator();

		int tElem = 0;
		int cont = 0;
		while (cont < 3) {
			tElem = integerIterator.next();
			cont++;
		}

		System.out.println(linkedList);
		System.out.println(tElem);

		//Averiguando el elemento de la mitad de la linkedList.
		System.out.println("\nAveriguando el elemento de la mitad de la linkedList.");
		System.out.println(linkedList.get(linkedList.size()/2));

		//Averiguando si un array tiene elementos duplicados.
		System.out.println("\nAveriguando si un array tiene elementos duplicados.");
		String[] withDuplicates = new String[] {"one","two","three","one", "eight", "one", "nine"};
		System.out.println("Array: " + Arrays.toString(withDuplicates));
		Set<String> miSet= new LinkedHashSet<>();

		for (String el : withDuplicates){
			if (!miSet.add(el)){
				System.out.println("El siguiente elemento del array es un duplicado: '" + el + "'. Se eliminara del array.");
			}
		}
		System.out.println("Array sin duplicados: " + miSet);

	}
}
