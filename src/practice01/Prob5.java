package practice01;

public class Prob5 {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 99; i++) {

			String s = String.valueOf(i);

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
					count++;
				}
			}

			if (count == 0) {
				continue;
			} else {
				System.out.print(s + " ");
				for (int z = 0; z < count; z++) {
					System.out.print("짝");
				}
			}
			count = 0;
			System.out.println();

		}
	}

}