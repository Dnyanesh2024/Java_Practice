package B12;

import java.util.Scanner;

public class PalendromNumber {

	public static void main(String[] args) {
		
		// Input from user 
		
		String str;
		
		String rev="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		
		
		str = sc.nextLine();
		//int len=str.length();
		//int rev=0;
		
		for (int i=str.length()-1; i>=0; i--) {
			
			rev=rev+str.charAt(i);
			
		}
		
		if (str.equals(rev)) {
			
			System.out.println("String is Palindrom: "+rev);
			
		} else {
			
			System.out.println("String is not Palindrom: "+rev);


		}
		
		System.out.println("Reverse String is: "+rev);
		
	}

}
