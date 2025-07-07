package BatchNew_Prectice;

public class Compressstring_Program {

	public static void main(String[] args) {

		String str = "aaabbbbcccffdddcce";
		int count = 1;

		String Ans = " " + str.charAt(0);

		for (int i = 1; i < str.length(); i++) {

			char current = str.charAt(i);
			char prev = str.charAt(i-1);

			if (current == prev) {

				count++;
				// System.out.println(count);
			} else {
				//if (count > 1) 
					Ans+=count;
					
				//System.out.println(count);
				count = 1;
				Ans += current;
			}

		}

		//if (count > 1)
			Ans += count;
		System.out.println(Ans);
	}

}
