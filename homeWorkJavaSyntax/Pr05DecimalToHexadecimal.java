package homeWorkJavaSyntax;

import java.util.Scanner;

public class Pr05DecimalToHexadecimal {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(Integer.toHexString(scanner.nextInt()).toUpperCase());

	}

}
