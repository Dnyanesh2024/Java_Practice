package BatchNew_Prectice;

import java.util.Iterator;

public class String_Programs {

	public static void main(String[] args) {
		// Print Sting

		String str = "I am an educator";

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i));
			System.out.print("");
		}

		System.out.println();
		System.out.println("******************************");
		// Reverse string

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
			System.out.print("");
		}
		System.out.println();
		System.out.println("******************************");
		// Word count or length of word and //Reverse Word given string at a place

		/*
		 * for (int i = 0; i < str.length(); i++) {
		 * 
		 * System.out.println( str.split(" ")); System.out.println( str.charAt(i));
		 * 
		 * 
		 * count++;
		 * 
		 * }
		 */

		/*
		 * for (int i = 0; i < rvs.length; i++) { System.out.println(str.charAt(i));
		 * count++; }
		 */
		String a[] = str.split(" ");

		System.out.println("Number of words in given string is : " + a.length);

		System.out.println("++++++++++++++++++++++++++++++++++");

		String ar[] = str.split(" ");

		for (int i = 0; i < ar.length; i++) {
			// word added in string variable
			String s = ar[i];
			// for loop for reverse word

			for (int j = s.length() - 1; j >= 0; j--) {
				System.out.print(s.charAt(j));
			}

			System.out.print(" ");
		}
		System.out.println(  );
		System.out.println("+++++++++++++++++++++++++++++++");

		// Aakash code
		String words[] = str.split("[ ]");

		String reverseString = " ";

		for (String w : words) {
			String reverseWords = " ";

			for (int i = w.length() - 1; i >= 0; i--) {

				reverseWords = reverseWords + w.charAt(i);

			}

			reverseString = reverseString + reverseWords;
		}

		System.out.println(reverseString);

		System.out.println("++++++++++++++++++++++++++++");
		// Count element in string

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("Count of element e is : " + count);

		System.out.println("+++++++++++++++++++++++++++++++++");
		//First_Char_Upper Case of_Given Strings Program 
		
		String str1 = "Welcome to pune";
		
		for (int i = 0; i < str1.length(); i++) {
			
			if (i==0 && Character.isLowerCase(str1.charAt(i))) {
				
				System.out.print(Character.toUpperCase(str1.charAt(i)));
			}
			
			if (i!=0 && str1.charAt(i-1)==' ')
			{
				System.out.print(Character.toUpperCase(str1.charAt(i)));

			}else {
				System.out.print(str1.charAt(i));
				
			}
						
		}


	}

}
