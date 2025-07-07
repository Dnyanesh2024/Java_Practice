 package B12;

public class Remove_Dupplicate_Element {

	public static void main(String[] args) {

		String s= "ABCDABCDABCD";
		
		String result= " ";
		
		for (int i = 0; i < s.length(); i++) {
			
			String ch = ""+s.charAt(i);
			if(result.contains(ch)) {
				continue;
			}
			result +=ch;
		}
		System.out.println(result);
	}

}
