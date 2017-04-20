package collection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
	
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(2007," Shubham");
		hm.put(2008," Karan");
		hm.put(2009,"Aish ");
		hm.put(2010,"Shivi ");
		System.out.println(hm);
		
for (Map.Entry m:hm.entrySet()) {
			
	 System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println(" ");
		//3.Usinf Iterator
		
		Enumeration e=(Enumeration) hm.entrySet();
		while(e.hasMoreElements())
				System.out.println(e.nextElement());
	
	
	}
}
