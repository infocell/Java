package homeWorkJavaSyntax;

import java.util.Scanner;

public class Pr01RectangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int area = a * b;
		System.out.println(area);
	}

}
