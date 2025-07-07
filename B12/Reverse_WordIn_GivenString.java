package B12;

import java.util.Iterator;

public class Reverse_WordIn_GivenString {

	public static void main(String[] args) {

		String s = "Reverse word program in java";
		
		int count = 0;
		
		String a[]=s.split(" ");
		
		System.out.println(a.length);
		
		System.out.println("********************************************************");
		
	    // Reverse Word In String.
		
		for (int i = 0; i < a.length; i++) {
			
			String s1=a[i];
			for(int j=s1.length()-1;j>=0;j--) {
				System.out.print(s1.charAt(j));
				
			}System.out.print(" "); 
		}
		
		System.out.println("*********************************************************");
		
		//Occurrence of element in string 
		
		for (int i = 0; i < a.length; i++) {
			if (s.charAt(i)== 'r') {
				
				count++;
				
			}
		}System.out.print(count);
	
		//System.out.println("*******************************************************");
		
	}
	
}
