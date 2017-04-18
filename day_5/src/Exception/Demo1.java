package Exception;

import java.util.Scanner;

public class Demo1 {

		public static void main(String[] args) {
			
			
			Scanner sc=new Scanner(System.in);
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
			
			
		}
		
}
