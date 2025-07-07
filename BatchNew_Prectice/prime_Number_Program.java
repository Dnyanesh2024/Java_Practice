package BatchNew_Prectice;

public class prime_Number_Program {

	public static void main(String[] args) {

		int num = 13;

		boolean prime = true;

		for (int i = 2; i <= num / 2; i++) {

			// i>num/2 used for to check given num is only  complete divisible by its half number.

			if (num % i == 0) {

				prime = false;

				break;
			}
		}

		if (prime) {
			
			System.out.println("Given number is prime : " + num);		
		}
		
		else {
			System.out.println("Ginen number is not prime :"+num);
		}
	}

}
