package homeworkLoopsMethodsClasses;

import java.util.Scanner;

public class Pr01SymmetricNumbersInRange {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int start = scanner.nextInt();
		int end = scanner.nextInt();

		if (start < 0 || end > 999) {
			System.out.println("Warning: 0 ≤ start ≤ end ≤ 999");
			return;
		}
		for (int number = start; number <= end; number++) {
			if (number / 10 == 0) {
				System.out.print(number);
				System.out.print(" ");
			} else if (number / 100 == 0) {
				if (number % 10 == number / 10) {
					System.out.print(number);
					System.out.print(" ");
				}
			} else if (number / 1000 == 0) {
				if (number % 10 == number / 100) {
					System.out.print(number);
					System.out.print(" ");
				}
			}
		}
	}
}
