 package B12;

import java.util.Scanner;

public class Seperate_VowelsAndConsonants {

	public static void main(String[] args) {

		//Seperate_VowelsAndConsonants vc = new Seperate_VowelsAndConsonants();
		
		

		String s = "Santya Selenium working in mahait";

		/*
		 * String OriginalString = s;
		 * 
		 * String Ovelse = s.replaceAll("[^aA,eE,iI,oO,uU]", "");
		 * 
		 * String Consonants = OriginalString.replaceAll("[aA,eE,iI,oO,uU]", "");
		 * 
		 * System.out.println("All Consonants: "+Consonants);
		 * 
		 * System.out.println("All Ovelse: "+Ovelse);
		 */

		/*
		 * int vCount = 0, cCount=0;
		 * 
		 * for (int i = 0; i < s.length()-1; i++) {
		 * 
		 * if
		 * (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.
		 * charAt(i)=='u') {
		 * 
		 * vCount++;
		 * 
		 * 
		 * System.out.println(s.charAt(i));
		 * 
		 * } else {
		 * 
		 * cCount++;
		 * 
		 * System.out.println(s.charAt(i)); }
		 * 
		 * } System.out.println();
		 * 
		 * System.out.println(vCount);
		 * 
		 * System.out.println(cCount);
		 * 
		 */
		
		//Approach 2.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");

		String str = sc.next();

		str.toLowerCase();

		String vowels = " ";

		String consonants = " ";

		for (int i = 0; i < str.length() - 1; i++) {

			char ch = str.charAt(i);

			if (Character.isLetter(ch)) {

				if (vowel(ch)) {

					vowels += ch;

				} else {

					consonants += ch;

				}

			}

		}

		System.out.println("Vowels are : " + vowels);
		
		System.out.println("consonants are : " + consonants);
	}

	public static boolean vowel(char ch) {

		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

	}

}
