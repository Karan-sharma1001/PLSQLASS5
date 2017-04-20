package day6;

public class Mythread extends Thread {

	String s;
	public void run() {
System.out.println("Hello Programmer");		
	}
	public static void main(String[] args) {
		
		Mythread a =new Mythread();
		a.start();
	}

}
