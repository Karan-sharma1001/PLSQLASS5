package Exception;

import java.io.BufferedReader;
import java.util.Scanner;



public class Clinic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Doctor d=new Doctor();
	try {
	System.out.println("Enter doctors degree=>");
	String deg=sc.useDelimiter("\n").next();
	d.setDegree(deg);
	System.out.println("Enter doctors name=>");
	String nam=sc.next();
	d.setName(nam);
	System.out.println(d);
	
	} catch (DoctorException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println();
}
}
