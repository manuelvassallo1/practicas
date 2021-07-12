package HackerRankChallenges.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
	public static void main(String[] args) {
		List<Integer> f1 = Arrays.asList(11, 2, 4);
		List<Integer> f2 = Arrays.asList(4, 5, 6);
		List<Integer> f3 = Arrays.asList(10, 8, -12);

		List<List<Integer>> arr = new ArrayList<>();
		arr.add(f1);
		arr.add(f2);
		arr.add(f3);

		System.out.println(diagonalDifference(arr));

	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int diag1 = 0;
		int diag2 = 0;
		int nfc = arr.get(0).size();
		for (int i = 0, j = nfc - 1; i < nfc; i++, j--) {

			diag1 += arr.get(i).get(i);
			diag2 += arr.get(i).get(j);
		}

		return Math.abs(diag1 - diag2);
	}

}


