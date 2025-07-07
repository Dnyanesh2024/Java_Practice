package B12;

public class Employee {
	
	int id;
	String Name;
	int salary;
	int age;
	
	
	void Work() {
		
		System.out.println("Haresh Is working");
	}
	
	
	
	void Travel() {
		
		System.out.println("Haresh is traveling");
	}
	
	

	public static void main(String[] args) {
		
		Employee E1 = new Employee();
		
		E1.id = 101;
		E1.Name = "Haresh";
		E1.salary = 50000;
		E1.age = 30;
		
		
		
		System.out.println("Employee Id Is : "+ E1.id);
		System.out.println("Employee Id Is : "+E1.Name );
		System.out.println("Employee Id Is : "+ E1.salary);
		System.out.println("Employee Id Is : "+E1.age);
		
		
		System.out.println("*****************************");
		
		
		E1.Work();
		E1.Travel();

	}

}
