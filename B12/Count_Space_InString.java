package B12;

import java.util.Iterator;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;

public class Count_Space_InString {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);

		//System.out.println("Enter String : ");

		String str = "dfghjlDsaf$369*FDGH&89tnlBHFHvbbljmvkldj";
		
		System.out.println(str.length());
				
		int Totalcount = str.length();

		String str1 = str.replaceAll("[^a-zA-Z]", "");
	
		System.out.println(str1.length());

		int TotalcountAfterRemove = str1.length();
		
		int count = Totalcount - TotalcountAfterRemove;
		
		System.out.println("Total count space: "+count);
		
		System.out.println(str);
		
		System.out.println(str1);

	}

}
