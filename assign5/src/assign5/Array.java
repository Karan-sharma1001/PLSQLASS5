package assign5;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int a[ ]=new int[10]; 
	
			
			
			Scanner sc=new Scanner(System.in);
			for (int i = 0; i < a.length; i++) {
			System.out.println("Enter Value for "+i);
				a[i]=sc.nextInt();
			}
			
			
			
			try{
				
			System.out.println("Enter Index");
			System.out.println("For array");
			int idx=sc.nextInt();	
			System.out.println("Character at entered index is"+a[idx]);
			}
			catch(ArrayIndexOutOfBoundsException a1){
				System.out.println("For array Please enter 0:10value only");
			}

}
}
