package assign6;

public class ThreadDemo {
public static void main(String[] args) {
	Runnable a=new MyThread();
	Thread a1=new Thread(a);
	Thread a2=new Thread(a);
	//MyThread a1=new MyThread(a);
	//MyThread a2=new MyThread(a);
	
	a1.start();
	a2.start();
}
}
