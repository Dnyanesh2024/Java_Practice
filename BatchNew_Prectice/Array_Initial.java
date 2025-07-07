package BatchNew_Prectice;

public class Array_Initial {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int A[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		// .out.println("Value of an array is : "+A[1][1]);

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				System.out.print(A[i][j] + "\t");

			}

			System.out.println();
		}

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(A[i][j] + "\t");
			}

			System.out.println();
		}
	}

}
