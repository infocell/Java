package homeWorkJavaSyntax;

import java.util.Scanner;

public class Pr08CountOfEqualBitPairs {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int counter = 0;
		while (n != 0) {
			if ((n & 3) == 3 || (n & 3) == 0) {
				counter++;
			}
			n = n >> 1;
		}

		System.out.println(counter);
	}

}
