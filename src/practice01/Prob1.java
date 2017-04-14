package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("수를 입력하시오 : ");

		int number = scanner.nextInt();

		System.out.println(number);

		scanner.close(); // 자원을 닫아줌 닫아주지 않으면 scanner워닝이 뜸

		if (number % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}
}
