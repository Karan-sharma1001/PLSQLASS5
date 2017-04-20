package Multithread;

public class Mythread extends Thread {

	String s;
	public Mythread(String s) {
		//super();
		//this.s = s;
		setS("t1");
		start();
	}
	public Mythread() {
		super();
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public void run() {
System.out.println("Hello Programmer");		
	}
	public static void main(String[] args) {
		
		//Mythread a =new Mythread("t1");
		//a.start();
		new Mythread();
		
		
	}
	

}
