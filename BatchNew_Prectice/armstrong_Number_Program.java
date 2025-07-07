package BatchNew_Prectice;

public class armstrong_Number_Program {

	public static void main(String[] args) {

		int num = 153;
		
		int copy_Of_num = num;
		
		int sum = 0;
		
		int reminder;
		
		while (num>0) {
			
			reminder = num%10;
			
			sum = sum+(reminder*reminder*reminder);
			
			num = num/10;
			
		}
		
		if (sum == copy_Of_num) {
			
			System.out.println("Given number is armstrong number : " + sum);
			
		}
		else {
			
			System.out.println("Given number is not armstrong number : " + sum);
		}
	}

}
