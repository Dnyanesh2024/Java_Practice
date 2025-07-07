package B12;

public class Method_Overriding {

	public static void main(String[] args) {
		
		KC_College clg = new KC_College();
		clg.admission();
		clg.vacancies(1000);
		clg.cutoff(95.99f);			
	}
}

class MJ_college {
	
	String Science;
	String Commers;
	String Arts;

	public void vacancies(int a) {

		System.out.println("Vacancies in MJ college is :" + a);
	}

	public void cutoff(float a) {

		System.out.println("Cut off % is :" + a);
	}
}

class KC_College extends MJ_college {

	public void admission() {

		System.out.println("Welcome to KC college dmission is start from 15th of june...");
	}

	public void vacancies(int a) {

		System.out.println("Vacancies in KC college is :" + a);
	}

	public void cutoff(float a) {

		System.out.println("Cut off % is :" + a);
	}

}