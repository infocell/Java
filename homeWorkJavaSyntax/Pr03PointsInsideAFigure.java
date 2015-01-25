package homeWorkJavaSyntax;

import java.util.Scanner;

public class Pr03PointsInsideAFigure {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double pointX = scanner.nextDouble();
		double pointY = scanner.nextDouble();

		if (pointX >= 12.5 && pointX <= 22.5 && pointY >= 6 && pointY <= 8.5) {
			System.out.println("Inside");
		} else if (pointX >= 12.5 && pointX <= 17.5 && pointY >= 8.5
				&& pointY <= 13.5) {
			System.out.println("Inside");
		} else if (pointX >= 20 && pointX <= 22.5 && pointY >= 8.5
				&& pointY <= 13.5) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}

}
