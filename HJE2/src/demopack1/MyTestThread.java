package demopack1;

public class MyTestThread {
	public static void main(String[] args) {
		ThreadA th1 = new ThreadA();
		ThreadB th2 = new ThreadB();
		ThreadA th3 = new ThreadA();
		th3.setName("Ashish");
		
		th2.setPriority(10);
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		th1.start();
		th2.start();
		
		System.out.println(th3.getName());
		System.out.println(th3);
		
	}

	
	

}
