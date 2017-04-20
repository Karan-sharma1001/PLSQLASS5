package assign6;

public class Counter extends Thread {
	static int count;
	private int a;
@Override
public void run() {
	// TODO Auto-generated method stub
	super.run();
	System.out.println("In counter thread"+currentThread().getName());
	synchronized (this ) {
		
	
		count++;
		a=count;
}
}
public int getA() {
return a;	
}



}
