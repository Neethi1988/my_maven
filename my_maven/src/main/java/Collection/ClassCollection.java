package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// non-generic array list
 ArrayList ar1=new ArrayList();
 ar1.add(34);
 ar1.add("Neethi");
 ar1.add('C');
 System.out.println(ar1);
 
    // generic array list
 ArrayList<String> al = new ArrayList();
 al.add("Hello");
 al.add("World");
 al.add(":)");
 System.out.println(al);
 al.remove(2);
 System.out.println(al);
 //generic array list
 ArrayList<String> al1=new ArrayList();
 al1.add("Apple");
 al1.add("Mango");
 al1.add("Banana");
 System.out.println(al1);
 al.addAll(al1);
 System.out.println(al);
 ar1.removeAll(ar1);
 System.out.println(ar1);
 al1.get(1);
 System.out.println(al1.get(1));
 System.out.println(al1.size());
 boolean s= al1.contains("Mango");
 System.out.println(s);
 boolean s1=al1.contains("Orange");
 System.out.println(s1);
 boolean s2=al1.isEmpty();
 System.out.println(s2);
 al1.remove("Apple");
 System.out.println(al1);
 
 Iterator it= al1.iterator();
 while(it.hasNext())
 {
	 System.out.println(it.next());
	 
 }
 it.remove();
 System.out.println(al1);
	}

}
