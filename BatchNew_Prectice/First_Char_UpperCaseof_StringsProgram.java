package BatchNew_Prectice;

public class First_Char_UpperCaseof_StringsProgram {

	public static void main(String[] args) {

		String str = "Welcome to pune";

		for (int i = 0; i < str.length(); i++) {
			
			if (i == 0 && Character.isLowerCase(str.charAt(i))) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
				continue;
			}

			if (i != 0 && str.charAt(i - 1) == ' ') {
				
				System.out.print(Character.toUpperCase(str.charAt(i)));

			} else {
				System.out.print(str.charAt(i));

			}

		}
	}

}
