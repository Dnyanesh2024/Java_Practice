package B12;

public class NumberSystem_Program {

	public static void main(String[] args) {

		for (int i = 2; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				int Result = i * j;
				System.out.print(Result + "\t");
			}

			System.out.println();
		}
		System.out.println("*******************************************************************************");

		int a = 2;
		while (a <= 10) {
			int b = 1;
			while (b <= 10) {
				int R = a * b;
				System.out.print(R + "\t");
				b++;
			}

			System.out.println();
			a++;
		}
		System.out.println("********************************************************************************");

		int p = 0, q = 1;
		System.out.print(p + "\t" + q + "\t");

		for (int i = 1; i <= 8; i++) {

			int result = p + q;

			System.out.print(result + "\t");
			p = q;
			q = result;
		}
		System.out.println("********************************************************************************");

		int m, n = 0;
		int y = 17;
		boolean x = true;

		if (y / 2 == 0) {
			System.out.println(n + " is not prime number");

		} else {
			for (m = 2; m <= n; m++) {
				if (y % m == 0) {
					System.out.println(n + " is not prime number");
					x = false;
					break;
				}
			}
			if (x == true) {
				System.out.println(n + " is prime number");
			}

		}

	}
}
