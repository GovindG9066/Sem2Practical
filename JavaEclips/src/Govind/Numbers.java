package Govind;

public class Numbers extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
//			System.out.println("Thread is running:"+i);
			System.out.println(Thread.currentThread().getName());
//			try {
//				System.out.println("Thread is running:"+i);
//				Thread.sleep(2000);
//			}catch(Exception e) {}
		}
	}
	
}
