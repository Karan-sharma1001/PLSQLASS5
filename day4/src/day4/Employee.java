package day4;
import java.util.*;
public class Employee {
	
	String name;
	String address;
	int empid;
	Scanner m=new Scanner(System.in);
	
	public boolean equals(Employee a, Employee b) {
			
		boolean x1;
		boolean x2;
		x1=a.name.equals(b.name);
		System.out.println("Name of two objects are equals: "+x1);
		x2=a.address.equals(b.address);
		System.out.println("Name of two objects are equals: "+x2);
		if (a.empid==b.empid){
		System.out.println("Name of two objects are equals: True");
		}
		else{
			System.out.println("Name of two objects are equals: False");
			
		}
		return true;
	}
	
	public void getDet() {
		System.out.println("Enter name,address,empid");
	this.name=m.next();
	this.address=m.next();
	this.empid=m.nextInt();
		
	}
	public void chk() {
            System.out.println("Hello New employee : "+empid);
	   }
	
	
	public boolean equals(Object o){
	Employee e1=(Employee)o;
		if (this.empid ==e1.empid)
			return true;
		else 
			return false;
		
	}
	
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getDet();
		Employee e2=new Employee();
		e2.getDet();
		
		boolean x;
		x= e1.equals(e2);
		System.out.println("Two Objects are Equals = " + x);
		x=e1.equals(e1,e2);
	}



}
