package HackerRankChallenges.Java;

import java.util.Scanner;

public class JavaEOF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;

		while (sc.hasNext()) {
			System.out.println(i + " " + sc.nextLine());
			i++;
		}
		sc.close();
	}
}
