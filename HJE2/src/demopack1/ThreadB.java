package demopack1;

public class ThreadB extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 11; i <= 15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
