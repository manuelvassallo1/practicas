package HackerRankChallenges.Algorithms;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = Arrays.asList(0, 0);
		int comp;
		for (int i = 0; i < a.size(); i++) {
			comp = a.get(i).compareTo(b.get(i));
			if (comp < 0)
				result.set(1, result.get(1) + 1);
			else if (comp > 0)
				result.set(0, result.get(0) + 1);
		}
		return result;

	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(4, 4, 3);
		List<Integer> b = Arrays.asList(3, 2, 1);
		List<Integer> result = compareTriplets(a, b);
		System.out.println(result);
	}
}
