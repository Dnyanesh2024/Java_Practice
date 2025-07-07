package BatchNew_Prectice;

public class palindrom_Number_Program {

	public static void main(String[] args) {

		int num = 12321;
		
		int copy_of_num = num;
		
		int reminder;
		
		int add = 0 ; 
		
		while (num>0) { 
			
			//Getting Reminder or last digit of given number
			reminder = num%10;
			
			//Addition of reminder and store in to the add 
			add = (add*10) + reminder;
			
			//Remove last digit of num after getting reminder
			num = num/10;
			
		}
		
		if (copy_of_num == add) {
			
			System.out.println("Given number is palindrome");
		}
		else {
			
			System.out.println("Given number is not palindrome");
		}
	}

}
