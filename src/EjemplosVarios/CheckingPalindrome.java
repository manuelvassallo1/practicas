package EjemplosVarios;

import javax.sound.sampled.ReverbType;
import java.util.Arrays;

public class CheckingPalindrome {
	public static void main(String[] args) {
		int numOrig = 313;
		int reverse = 0;
		int aux = numOrig;

		System.out.println("El numero original es " + numOrig);

		while (aux != 0) {
			reverse *= 10;
			reverse += aux % 10;
			aux /= 10;
		}
		System.out.println("El numero al reves es " + reverse);

		if (numOrig == reverse)
			System.out.println(numOrig + " es un palindromo");
		else
			System.out.println(numOrig + " no es un palindromo");

		String input = "Arriba la birra";
		String auxInput = input
				.replace(" ", "")
				.toLowerCase();


		StringBuilder input1 = new StringBuilder(auxInput).reverse();
		String fraseFinal = "\nLa frase '" + input + "' ";
		if (auxInput.equals(input1.toString()))
			System.out.println(fraseFinal += "es un palindromo.");
		else
			System.out.println(fraseFinal += "no es un palindromo.");

		//Usando recursividad, revertir un String
		String str = "La concha bien de tu madre";
		String reverseStr = reverseRecursively(str);
		System.out.println(reverseStr);
	}

	public static String reverseRecursively(String str) {

		//base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}
}
