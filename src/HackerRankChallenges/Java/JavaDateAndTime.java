package HackerRankChallenges.Java;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;


public class JavaDateAndTime {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();

		System.out.println(findDay(month, day, year));
	}

	public static String findDay(int month, int day, int year) {
		LocalDate localDate = LocalDate.of(year, month, day);
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();

		return dayOfWeek.toString();
	}
}

