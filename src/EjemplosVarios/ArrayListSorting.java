package EjemplosVarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(2015);
		arr.add(2011);
		arr.add(2019);
		arr.add(2013);
		arr.add(2008);
		arr.add(2020);


		List<Integer> arr2 = new ArrayList<>(arr);
		Collections.sort(arr2);

		List<Integer> arrReverse = new ArrayList<>(arr);
		arrReverse.sort(Collections.reverseOrder());

		System.out.println(arr.toString());
		System.out.println(arr2.toString());
		System.out.println(arrReverse.toString());
	}
}
