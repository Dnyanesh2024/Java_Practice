package BatchNew_Prectice;

public class Array_Sort_Large_Small_Element {

	public static void main(String[] args) {

		int a[] = { 10, 4, 20, 2, 56, 9, 44 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);

		}

		System.out.println("Largesrt number " + a[a.length - 1]);
		System.out.println("Smalest number " + a[0]);
		System.out.println("Second Largesrt number " + a[a.length - 2]);
		System.out.println("Seconf smalest number " + a[0 + 1]);
	}

}
