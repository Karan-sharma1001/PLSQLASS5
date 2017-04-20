package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("VaShi");
		a.add('A');
		a.add(true);
		a.add(1.20f);
		a.add(new employee("Karan",20,10));
		//System.out.println(a.size());
	//	System.out.println(a.get(5));
		//System.out.println(a.remove(1.20f));
		//1
		System.out.println(a);
		System.out.println(" ");
		//2
		for (int i = 0; i < a.size(); i++) {
			
			System.out.println(a.get(i));
			
		}
		System.out.println(" ");
		//3.Usinf Iterator
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
