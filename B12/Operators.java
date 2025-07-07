package B12;

public class Operators {

	public static void main(String[] args) {
		
		// Unary Operator
		
		int a=10;
		int b=20;
		int c=30;
		float p = 20;
		float q = 30;
		System.out.println("*****Unary Operators*****");
		System.out.println(a++);		
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(++a);	
		System.out.println(a--);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(--a);
		
		System.out.println("*****Arithmetic Operators*****"); 					
		System.out.println(p+q);
		System.out.println(p-q);
		System.out.println(p*q);
		System.out.println(p/q);
		System.out.println(p%q);
		
		System.out.println("*****Relational Operator*****");
		System.out.println(p<q);
		System.out.println(p>q);
		System.out.println(p<=q);
		System.out.println(p>=q);
		System.out.println(p!=q);
		System.out.println(p==b);
		
		System.out.println("*****Logical Operator******");
		System.out.println(a<b && b<c);
		System.out.println(b==p && c==q);
		System.out.println(p>q && a<=c);
		
		System.out.println("*****Assignment Operator******");
		
		int x,y;
		x= b-a;      // c is equal to 10 
		y= a+b;      // c is equal to 30
		System.out.println("c is equal to :"+x);
		System.out.println("c is equal to :"+y);
	}

}
