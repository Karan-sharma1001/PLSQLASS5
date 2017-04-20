package assign6;

//public class MyThread extends Thread {
public class MyThread implements Runnable{
public static int count;
 String a;
	@Override
	public void run() {
		count++;
		System.out.println("Thread Created : "+count);
		System.out.println("Name is : "+a);
	}
	public MyThread(String a) {
		super();
		this.a = a;
	}
	
	public MyThread() {}
	
}
