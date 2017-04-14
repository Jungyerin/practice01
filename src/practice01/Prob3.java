package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		int i = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("수를 입력하시오 : ");

		int number = scanner.nextInt();

		// System.out.println(number);
		scanner.close();

		if (number % 2 == 0) {
			i = 2;
		} else {
			i = 1;
		}

		for (; i <= number; i = i + 2) {
			result = result + i;
			if (i == number) {
				System.out.print(i);
			} else {
				System.out.print(i + "+");
			}
		}

		System.out.print("=" + result);

	}
}
