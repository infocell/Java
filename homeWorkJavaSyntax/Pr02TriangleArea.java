package homeWorkJavaSyntax;

import java.util.Scanner;

public class Pr02TriangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// point A
		int xA = scanner.nextInt();
		int yA = scanner.nextInt();

		// point B
		int xB = scanner.nextInt();
		int yB = scanner.nextInt();

		// point C
		int xC = scanner.nextInt();
		int yC = scanner.nextInt();

		int area;

		area = Math.abs((xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2);
		System.out.println(area);
	}

}
