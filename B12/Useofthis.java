package B12;

public class Useofthis {

	public static void main(String[] args) { // can't use this with static method

		Use th = new Use();
		th.add();
		System.out.println("Call by using object: " + (th.a + th.b)); // access by using object in main class
		System.out.println("________________________________________________________");
		System.out.println("Call by using object: " + (th.a * th.b));

		th.Mul(10, 20);
		System.out.println("Call by using object: " + (th.a * th.b));

	}
}

class Use {

	int a = 200; // class variable

	int b = 300;

	void add() {

		int a = 50; // local variables
		int b = 100;
		System.out.println("Using local variable: " + (a + b));

		System.out.println("Using this keyword: " + (this.a + this.b));

		System.out.println("________________________________________________________");
	}

	void Mul(int a, int b) {

		this.a = a;
		this.b = b;

		System.out.println(this.a * this.b);
	}
}
