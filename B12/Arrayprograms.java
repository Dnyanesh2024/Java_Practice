package B12;
public class Arrayprograms {

	public static void main(String[] args) {
		// program for sorting an array in ascending or descending order.
		System.out.println("program for print an array in ascending order");
		int temp;
		int a[] = { 100, 20, 250, 63, 196, 57 };
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}           
			}
			System.out.print(a[i] + "\t");
		}
		System.out.println("  ");

		System.out.println("***********************************************************************************************");
		// program for print an array in ascending order
		System.out.println("program for print an array in descending order");
		int ar[] = { 100, 20, 250, 63, 196, 57 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {

				if (ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.print(ar[i] + "\t");
			System.out.print("  ");

		}System.out.println("");
		
		System.out.println("************************************************************************************************");
		System.out.println("");
		System.out.println("Largest number of array is : "+ ar[0]);
		System.out.println("");
		System.out.println("Smallest number of array is :  " + ar[ar.length - 1]);
		System.out.println("");
		System.out.println("Second Largest number of array is : "+ ar[0+1]);
		System.out.println("");  
		System.out.println("Second Smallest number of array is :  " + ar[ar.length - 2]);
	}
}
