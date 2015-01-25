package homeWorkJavaSyntax;

import java.util.Scanner;

public class Pr06FormattingNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		short a = scanner.nextShort();
		
		if (a < 0 && a > 500) {
			System.out.println("Warning: 0 <= a <= 500");
			return;
		}
		
		
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		
		System.out.print("|");
		System.out.printf("%-10s", Integer.toHexString(a).toUpperCase());
		System.out.print("|");
		System.out.print(String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0'));
		System.out.print("|");
		System.out.printf("%10.2f",b);
		System.out.print("|");
		System.out.printf("%-10.3f",c);
		System.out.println("|");
	}

}
