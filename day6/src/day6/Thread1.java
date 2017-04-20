package day6;

public class Thread1 implements Runnable {

	@Override
	public void run() {
				System.out.println("Hello Programmer t1");

	}
public static void main(String[] args) {
	Runnable t =new Thread1();
	Thread t1=new Thread(t);
	t1.setName("t");
	t1.getName();
	t1.start();
	
}

}
