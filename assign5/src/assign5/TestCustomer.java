package assign5;

import java.util.Scanner;

public class TestCustomer {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Creation of new Customer");
		System.out.println("Enter Number, Name , Category");
		try {
			Customer c1=new Customer(a.next(), a.next(), a.next());
		} catch (InvalidInputException e) {
			System.out.println(e);
			//e.printStackTrace();
		}

	
	
	}

}
