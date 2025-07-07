package B12;

public class Char_Upper_Case {

	public static void main(String[] args) {

		String str = "Dnyaneshwar Rathod";
		int count1=0;
		String str1 = " ";
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i)=='a') {
				/*
				 * str1=str1 +str.charAt(i); count1++;
				 */
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}else {
				System.out.print(str.charAt(i));
			}			
		}
	}

}
