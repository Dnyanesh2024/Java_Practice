package B12;

import org.openqa.selenium.WebElement;

public class Using_CharArray_ReversString {

	public static void main(String[] args) {

		String str = "Independent";
		
		char[] res = str.toCharArray();
		
		int count= 0;
		
		for (int i= res.length-1;i>=0; i--) {
			
			System.out.print(res[i]);
		}System.out.println();
		System.out.println("************************************");
		
		for (int i = 0; i < res.length; i++) {
			if (str.charAt(i)== 'd') {
				count++;
			}
			
			
		}
		System.out.println("Occurrence of element in string is : "+count);
	}
	
	//WebElement

}
