
package Exception;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;
		try{
			
		System.out.println("Enter Index");
		System.out.println("For array");
		int idx=sc.nextInt();	
		System.out.println("Character at entered index is"+arr[idx]);
		}
		catch(ArrayIndexOutOfBoundsException a1){
			System.out.println("For array Please enter 0:3 value only");
		}
		try {

			String str="Ganesh";
			System.out.println("for string");
			System.out.println("Enter the Index");
			int idx=sc.nextInt();
			System.out.println("Character at enterd index is "+str.charAt(idx));
			
		} catch (StringIndexOutOfBoundsException s) {
		System.out.println("For string: Please enter value from 0 to 5 only");
		}
		/*
		System.out.println("Enter numerator");
		int num=sc.nextInt();
		System.out.println("Enter Denomenator");
		int den=sc.nextInt();
		try{
			
		
		float ans=num/den;
		System.out.println("Ans is : "+ans);
		
	}
		//ArithMetic or Throwable or Exception 
	catch(ArithmeticException a){
		System.out.println("Please enter non zero value for denominator");
	}
		
		*/
	}
	

}
