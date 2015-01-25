package homeWorkJavaSyntax;

import java.util.Scanner;

public class Pr07CountOfBitsOne {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int countOfBits1=0;
		
		while(n != 0) {
			
			if((n & 1) == 1) {
				countOfBits1++;
			}
			n = n >> 1;
		}
		
		System.out.println(countOfBits1);

	}
}
