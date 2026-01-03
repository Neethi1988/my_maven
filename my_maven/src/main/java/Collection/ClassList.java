package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List ll= new ArrayList<String>();
		ll.add("Ornage");
		ll.add("Apple");
		ll.add("Pineaaple");
		System.out.println(ll);
		List l2= new ArrayList();
		l2.add("Red");
		l2.add("Yellow");
		l2.add("White");
		System.out.println(l2);
		l2.addAll(ll);
		System.out.println(l2);
		System.out.println(l2.size());
		boolean s1= l2.isEmpty();
		System.out.println(s1);
		boolean s2= l2.contains("Black");
		System.out.println(s2);
		
		Iterator it= l2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(l2);

	}

}
