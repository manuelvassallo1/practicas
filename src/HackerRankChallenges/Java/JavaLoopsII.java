package HackerRankChallenges.Java;

import java.util.Scanner;

public class JavaLoopsII {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int formula = 0;
			int acum = 0;
			for (int j = 0; j < n; j++) {
				formula = (int) (Math.pow(2, j)) * b;
				sb.append(a + formula + acum + " ");
				acum += formula;

			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		in.close();
	}
}
