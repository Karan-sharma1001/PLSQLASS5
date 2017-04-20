package Assign_7;

import java.util.Scanner;

public class ArrayListDemo {
public static void main(String[] args) {
	Student a=new Student();
	Scanner sc=new Scanner(System.in);
	a.setNames();
	System.out.println("Enter Index number");
	a.searchName(sc.nextInt());
	System.out.println("Enter Index Name");
	a.searchName(sc.next());
	System.out.println("Enter name to remove");
	a.removeName(sc.next());
}
}
