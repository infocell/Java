package homeWorkJavaSyntax;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pr04TheSmallestOf3Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		Double smallest = null;
		
		if (a <= b && a <= c) {
			smallest = a;
		} else if (b <= a && b <= c) {
			smallest = b;
		} else if (c <= a && c <= b) {
			smallest = c;
		}
		
		
		//System.out.println(Math.min(a, Math.min(b, c)));
		
		DecimalFormat df = new DecimalFormat("#.#########");
		System.out.println(df.format(smallest));
	}

}
