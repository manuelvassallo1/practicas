package HackerRankChallenges.Java;

import java.util.Scanner;

public class Java_If_Else {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();

		if (N % 2 != 0)
			System.out.println("Weird");
		else if (N >= 2 && N <= 5)
			System.out.println("Not Weird");
		else if (N >= 6 && N <= 20)
			System.out.println("Weird");
		else
			System.out.println("Not Weird");

		scanner.close();
	}
}
