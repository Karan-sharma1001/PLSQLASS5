package Assign_7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	TreeSet<String> Product=new TreeSet<String>();
	System.out.println("Enter how many entries you want?");
	int a=sc.nextInt();
	for (int i = 0; i <a; i++) {
		System.out.println("Enter string for : "+i);
			Product.add(sc.next());
	}
	 Iterator itr = Product.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	System.out.println("First value is : "+Product.first());
	System.out.println("Last value is : "+Product.last());
	System.out.println("Enter value to be delete");
	System.out.println(Product.remove(sc.next()));
	System.out.println(Product.size());
	System.out.println(Product);
	
	
	}
}
