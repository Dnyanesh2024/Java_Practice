package B12;

public class Encapsulation {

	public static void main(String[] args) {
		
		Test_Encapsulation t= new Test_Encapsulation();
		t.setA(500);
		System.out.println(t.getA());
		t.setB(1500);
		System.out.println(t.getB());
		System.out.println("_______________________________________________________________");
		System.out.println(t.getA()+ t.getB());
	}	

}

class Test_Encapsulation{
	
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	private int b;
	
}
