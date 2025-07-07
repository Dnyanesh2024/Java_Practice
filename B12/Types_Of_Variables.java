package B12;

public class Types_Of_Variables {

	int p = 20; // Instance variable variables
	float q = 50.50f;
	String s = "Result";

	static int a = 50; // static variable

	public void method_A() {

		int r = 20; // local variables
		int j = 50;
		int R;
		
		R= r+j;
		System.out.println("Result is:"+R);

	}

	public static void main(String[] args) {

		Types_Of_Variables var = new Types_Of_Variables();
		System.out.println(" ");
		System.out.println("Value of Static Variable a is:"+Types_Of_Variables.a);
		System.out.println("");
		System.out.println("Value of Instance variable p is:"+ var.p);
		System.out.println("");
		System.out.println("Value of Instance variable q is:"+ var.q);
		System.out.println("");
		System.out.println("Output of Instance variable s is:"+ var.s);
		System.out.println("");
		
		var.method_A();
		
	}

}
