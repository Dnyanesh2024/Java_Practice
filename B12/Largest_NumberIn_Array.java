package B12;

public class Largest_NumberIn_Array {

	public static void main(String[] args) {
		
		Largest_NumberIn_Array a=new Largest_NumberIn_Array();
		
		a.largestNumber();

	}
	
	public void largestNumber() {
		
		int Array[] = {10, 5, 2,30,1};
		
		int temp=0;
		
		int res;
		
		for (int i = 0; i < Array.length; i++) {
			
			for (int j = 1; j < Array.length; j++) {
				
				if(Array[i] < Array[j]) {
					
					temp=Array[i];
					Array[i]=Array[j];
					temp=Array[j];
								
				}
			}
		}System.out.println(temp);
	}

}
