package homeworkLoopsMethodsClasses;

import java.util.Scanner;

public class Pr02Generate3LetterWords {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		for (int a = 0; a < str.length(); a++) {
			for (int b = 0; b < str.length(); b++) {
				for (int c = 0; c < str.length(); c++) {

					System.out.print(str.charAt(a));
					System.out.print(str.charAt(b));
					System.out.print(str.charAt(c));
					System.out.println();

				}

			}
		}

	}
}
