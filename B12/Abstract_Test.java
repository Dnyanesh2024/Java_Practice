package B12;

public class Abstract_Test {

	public static void main(String[] args) {

		show s = new show();
		s.add(40, 60);
		s.sub();

	}

}
// Abstract Method
abstract class adition {

	int a = 20;
	int b = 30;

	abstract void add(int a, int b);

	public void sub() {

		System.out.println("Substract Method");
	}

}
// Abstract Method access using extends key word
class show extends adition {

	@Override
	void add(int a, int b) {
		
		int add = a+b;

		System.out.println("adition of a and b is :"+ add);

	}

}