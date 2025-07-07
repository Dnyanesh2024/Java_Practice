package B12;

public class Interface {

	public static void main(String[] args) {

		Tata t = new Tata();
		t.GearSystem();
		t.carcolour();
	}

}

//Interface 
interface car {

	public void GearSystem();

	public void carcolour();
}
//Tata class implements car class

class Tata implements car {

	@Override
	public void GearSystem() {
		System.out.println("Gear system of car ");
	}

	@Override
	public void carcolour() {
		System.out.println("Colour of car is Black ");
	}

}
