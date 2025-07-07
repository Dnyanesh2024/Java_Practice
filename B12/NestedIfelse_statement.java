package B12;

public class NestedIfelse_statement {

	public static void main(String[] args) {

		int hight = 165;
		float premarks = 60.50f;
		float mainsmarks = 240.70f;
		int groundmarks = 75;
		float interviewmarks = 60;
		float totalmarks = (mainsmarks + groundmarks + interviewmarks);

		if (hight >= 165) {
			System.out.println("You are eligible for PSI preliminary entrance examinations...!!!");
			if (premarks >= 60.50) {
				System.out.println("Congratulations you are eligible for PSI mains entrance examinations...!!!");
				if (mainsmarks >= 225.70) {
					System.out.println("Congratulations you are eligible for PSI physical test...!!!");
					if (groundmarks >= 65) {
						System.out.println("Congratulations you are eligible for interview examinations...!!!");
						if (totalmarks >= 335.75) {
							System.out.println("Congratulations you are selected for PSI...!!!");
						} else {
							System.out.println("Sorry you are not selected for PSI...!!!");
						}
					} else {
						System.out.println("Sorry you are not eligible for interview examinations...!!!");
					}
				} else {
					System.out.println("Sorry you are not eligible for PSI physical test...!!!");
				}
			} else {
				System.out.println("Sorry you are not eligible for PSI mains entrance examinations...!!!");
			}
		} else {
			System.out.println("Sorry you are not eligible for PSI preliminary entrance examinations...!!!");
		}

	}

}
