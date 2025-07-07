package B12;

public class Super_Keyword {

	public static void main(String[] args) {
		
		/*Child c=new Child();
		*/

	}

}

	class SuperParent{
		
		SuperParent(){
			
			System.out.println("This is default constructor: ");
			
		}
		
		SuperParent(String name, int rollno){
			
			System.out.println("This is Parameterised constructor:" + name +"" + rollno);
			
		}
	}
	
//	//class Child extends SuperParent{
//		
//		int rollno;
//		//String name;
//		
//	
//		*/
//	