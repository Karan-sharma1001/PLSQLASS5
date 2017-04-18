package Arithematic;
import java.math.*;

public class Operations {
	public void add(int a,int b){
		int x=a+b;
		System.out.println("The Addition of "+a+" &"+b+"is "+x);
	}
	public void add(float a ,float b){
		float x=a+b;
		System.out.println("The Addition of "+a+" &"+b+"is "+x);
	}
	public void add(float a, int b){
		float x=a+b;
		System.out.println("The Addition of "+a+" &"+b+"is "+x);
	}
	public void add(int a , float b){
		float x=a+b;
		System.out.println("The Addition of "+a+" &"+b+"is "+x);
	}

	public void greater(int a , int b){
		int x=Math.max(a , b);
		System.out.println("Greater value is : "+x);
	}
	public void Smaller(int a , int b){
		int x=Math.min(a , b);
		System.out.println("Greater value is : "+x);
	}
 public void Squareroot(double a) {
	 double x=Math.sqrt(a);
	 System.out.println("Square root of  "+a+ " is : "+x);
	}
 
 
 
 
}
