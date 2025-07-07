package B12;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_listImpl {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<Integer>();

		lst.add(10);
		lst.add(20);
		lst.add(null);
		lst.add(30);
		lst.add(40);

		Iterator it = lst.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
		System.out.println("--------------------------------------------");
		lst.add(2, 50);
	
		System.out.println(lst);
	
		System.out.println(lst.remove(3));
	
		System.out.println(lst);

	}

}
