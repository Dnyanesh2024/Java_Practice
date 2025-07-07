package B12;

import java.util.Iterator;

public class String_Methods {

	public static void main(String[] args) {

		String str = "Welcome to mahait";

		System.out.println(str.replace('a', 'A'));

		System.out.println(str.length());

		System.out.println(str.chars());
		System.out.println(str.replaceAll("[ ]", "").length());

		System.out.println(str.split("[ ]").length);
		System.out.println("____________________________________________________________________________");

		String s = "At@dgfgj#D35D&Gjhd23F&dfh8*$75N#BR2423546!@436$5%%%*67&dfh8Gfrej";

		System.out.println(s.replaceAll("[^@#%&$*]", " "));
		System.out.println(s.replaceAll("[@#%&$*]", " "));
		System.out.println("____________________________________________________________________________");

		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[0-9]", ""));
		System.out.println("____________________________________________________________________________");
	
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[a-zA-Z]", ""));
		System.out.println("____________________________________________________________________________");
	
		System.out.println(s.replaceAll("[^0-9a-zA-Z]", ""));
		System.out.println(s.replaceAll("[0-9a-zA-Z]", ""));
		System.out.println("____________________________________________________________________________");

	}

}
