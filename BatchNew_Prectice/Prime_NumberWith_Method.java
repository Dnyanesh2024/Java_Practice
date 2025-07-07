package BatchNew_Prectice;

public class Prime_NumberWith_Method {

	public static void main(String[] args) {

		Prime_NumberWith_Method TP = new Prime_NumberWith_Method();

		for (int j = 3; j <= 20; j++) {
			TP.testprime(j);
		}

	}

	public void testprime(int num) {

		boolean prime = true;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {

				prime = false;

				break;
			}
		}

		if (prime) {

			System.out.println("Ginen number is prime :" + num);

		} else {
			System.out.println("Ginen number is not prime :" + num);

		}
	}

}
