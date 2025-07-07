package B12;

public class Array {

	public static void main(String[] args) {
		// Single dimensional array.
		System.out.println("Single dimensional array.");
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 1; i < a.length; i++) {

			System.out.print(a[i] + "\t");
		}
		System.out.println();
		System.out.println("****************************************************************************************");

		// Multidimension array.
		System.out.println("Multidimension dimensional array.");
		int ary[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int i = 0; i < 3; i++) {

 			for (int j = 0; j < 3; j++) {          
 
				System.out.print(ary[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("*****************************************************************************************");
		// Maximum and Minimum element from given array
		System.out.println("Find Maximum and Minimum element from given array");

		double arr[] = { 10.5, 55, 2, 500, 44, 33 };

		double max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}

		}

		System.out.println("maximum number in given array is " + max);
	}

}
