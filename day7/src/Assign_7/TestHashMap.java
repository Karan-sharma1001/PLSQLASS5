package Assign_7;

import java.util.Scanner;

public class TestHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student1 a=new Student1();
		System.out.println("Setnames");
		a.setNames();
		System.out.println("Printnames");
		a.printNames();
		System.out.println("getnames");
		a.getName(sc.next());
		System.out.println("PrintNamesKeySet");
		a.printNamesKeySet();
		System.out.println("SPrintsize");
		a.printSize();
		System.out.println("Remove");
		a.remove(sc.next());
		System.out.println("Printnames");
		a.printNames();
	
		
	}

}
