package Algorithms.Order.QuickSort;

import java.util.Arrays;

public class TestQuickSort {
	public static void main(String[] args) {
		int[] arr = {5, 3, 7, 9, 1, 4, 6, 8, 2, 0, 25, 76, 65, 88, 32};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int inicio, int fin) {
		int pivot = arr[inicio];
		int i = inicio;
		int j = fin;
		int aux;

		while (i < j) { //mientras no se hayan cruzado las busquedas
			while (arr[i] <= pivot && i < j) i++; //busco de izq a der un numero mayor al pivot
			while (arr[j] > pivot) j--; // busco de der a izq un numero menor que el pivot
			if (i < j) { //si no se cruzaron las busquedas intercambio los numeros
				aux = arr[i];
				arr[i] = arr[j];
				arr[j] = aux;
			}
		}

		arr[inicio] = arr[j]; //cambio el valor a asignar en el nuevo pivot por el de [j]
		arr[j] = pivot; //cambio el valor de [j] por el valor del pivot actual

		if (inicio < j - 1) //si el indice de inicio del array evaluado es menor a j-1, debo ordenar el sub-array izquierdo
			quickSort(arr, inicio, j - 1);
		if (j + 1 < fin) //si j+1 es menor al indice de fin del array evaluado, debo ordenar el sub-array derecho
			quickSort(arr, j + 1, fin);
	}
}
