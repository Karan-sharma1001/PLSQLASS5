package assign6;

public class que3 {
	
	public static void main(String[] args) {
		Runnable a=new MyThread("a");
		Runnable a11=new MyThread("b");
		Thread a1=new Thread(a);
		Thread a2=new Thread(a11);
		//MyThread a1=new MyThread(a);
		//MyThread a2=new MyThread(a);
		a1.setPriority(1);
		a2.setPriority(9);
		a1.start();
		a2.start();
			if(a1.getPriority()>a2.getPriority())
				System.out.println("a1 is greater priority");
			else
				System.out.println("a1 is greater priority");
			
		
	}
	}


