package assign5;

import java.util.Arrays;

public class InvalidInputException extends Exception {
	public InvalidInputException(String s){
		super(s);
		System.out.println("In InvalidInputException");
	}

	@Override
	public String toString() {
		return "Enter valid details";
	}

}
