package demopack1;

public class ThreadA extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread th = Thread.currentThread();
		System.out.println(th);
		
		System.out.println(th.getName()+th.getPriority());
		System.out.println(th.getPriority());
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
