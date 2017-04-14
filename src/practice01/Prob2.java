package practice01;

public class Prob2 {
	public static void main(String[] args) {

		int i;
		for (i = 1; i < 6; i++) {
			for (int j = i; j < i + 10; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}
}