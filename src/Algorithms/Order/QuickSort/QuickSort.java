package Algorithms.Order.QuickSort;

import java.util.Arrays;

public class QuickSort {

	public static void quicksort(int A[], int inicio, int fin) {

		int pivote = A[inicio]; // tomamos primer elemento como pivote
		int i = inicio;         // i realiza la búsqueda de izquierda a derecha
		int j = fin;         // j realiza la búsqueda de derecha a izquierda
		int aux;

		while (i < j) {                          // mientras no se crucen las búsquedas
			while (A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
			while (A[j] > pivote) j--;           // busca elemento menor que pivote
			if (i < j) {                        // si no se han cruzado
				aux = A[i];                      // los intercambia
				A[i] = A[j];
				A[j] = aux;
			}
		}

		A[inicio] = A[j];      // se coloca el pivote en su lugar de forma que tendremos
		A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

		if (inicio < j - 1)
			quicksort(A, inicio, j - 1);          // ordenamos subarray izquierdo
		if (j + 1 < fin)
			quicksort(A, j + 1, fin);          // ordenamos subarray derecho

	}

	public static void main(String[] args) {
		int[] arr = {5, 3, 7, 9, 1, 4, 6, 8, 2, 0, 25, 76, 65, 88, 32};
		quicksort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
