package Algorithms.Search;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {

		//Ordenar el array usando quickSort y encontrar el numero dado con binarySearch

		int[] arr = {5, 3, 7, 9, 1, 4, 6, 8, 2, 0, 25, 76, 65, 88, 32};
		System.out.println("Array original: " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Array ordenado: " + Arrays.toString(arr));

		int numToSearch = 32;
		int indexOfNum;

		indexOfNum = binarySearch(numToSearch, arr);
		if (indexOfNum != -1)
			System.out.println("El numero fue encontrado en el indice " + indexOfNum);
		else
			System.out.println("El numero no esta en el array.");
	}

	private static int binarySearch(int numToSearch, int[] arr) {
		int inicio = 0, fin = arr.length - 1;
		int medio;

		while (inicio <= fin) {
			medio = (inicio + fin) / 2;
			if (arr[medio] < numToSearch)
				inicio = medio + 1;
			else if (arr[medio] > numToSearch)
				fin = medio - 1;
			else
				return medio;
		}
		return -1;
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
		arr[j] = pivot; //cambio el valor de [j] por el valor del pivot

		if (inicio < j - 1) //si el indice de inicio del array evaluado es menor a j-1, debo ordenar el sub-array izquierdo
			quickSort(arr, inicio, j - 1);
		if (j + 1 < fin) //si j+1 es menor al indice de fin del array evaluado, debo ordenar el sub-array derecho
			quickSort(arr, j + 1, fin);
	}
}
