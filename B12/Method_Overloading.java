package B12;

public class Method_Overloading {

	public static void main(String[] args) {
 
		Method_Overloading st = new Method_Overloading();

		st.Student();
		System.out.println();
		st.Student(101);
		System.out.println();
		boolean ss = st.Student(201, "Dnyaneshwar");
		System.out.println(ss);

	}

	public void Student() {

		System.out.println("Without parameter");
	}

	public void Student(int rollno) {
		System.out.println("Method with one parameter");
		System.out.println("Roll no is :" + rollno);
	}

	public boolean Student(int rollno, String studname) {
		System.out.println("Method with two parameter"); 
		System.out.println("Roll no is :" + rollno);
		System.out.println("Student Name is :" + studname);
		return true;
	}

}
 