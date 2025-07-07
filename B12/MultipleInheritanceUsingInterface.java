package B12;

public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		child c=new child();
		c.home();
		c.car();
	}

}
// interface 1
interface Interface_1{
	
	public void home();

}
//interface 2
interface Interface_2{
	public void car();
	
}
// Achieving Multiple inheritance using interface

class child implements Interface_1,Interface_2{

	@Override
	public void car() {
		System.out.println("Interface_1...");
	}

	@Override
	public void home() {
		System.out.println("Interface_2...");
	}

}