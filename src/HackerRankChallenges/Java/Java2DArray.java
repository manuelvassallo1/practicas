package HackerRankChallenges.Java;

import java.util.Scanner;

public class Java2DArray {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		int acumMax = Integer.MIN_VALUE;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scanner.nextInt();
				if (i > 1 && j > 1) {
					int acum =
							arr[i][j]
									+ arr[i][j - 1]
									+ arr[i][j - 2]
									+ arr[i - 1][j - 1]
									+ arr[i - 2][j]
									+ arr[i - 2][j - 1]
									+ arr[i - 2][j - 2];
					if (acum > acumMax) {
						acumMax = acum;
					}
				}
			}
		}

		System.out.println(acumMax);

		scanner.close();
	}
}
