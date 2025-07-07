package B12;

import java.util.Iterator;

public class Number_Program {

	public static void main(String[] args) {

		for (int i = 2; i <= 10; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------------------------------------------");

		int j = 10;
		while (j >= 2) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j--;
		}
	}
}
