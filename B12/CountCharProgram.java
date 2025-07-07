 package B12;

public class CountCharProgram {

	public static void main(String[] args) {

		String s = "santosh satpute";

		char a[] = s.toCharArray();
		String ss = " ";

		for (int i = 0; i < a.length; i++) {
			int count = 1;

			if (ss.contains(String.valueOf(a[i]))) {

				continue;
			}
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					count++;
				}
			}
			ss = ss + a[i];

			System.out.println("Count of " + a[i] + " is : " + count);
		}

	}

}
