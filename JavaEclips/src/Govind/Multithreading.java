package Govind;

public class Multithreading {
	public static void main(String[] args) {
		Numbers n1=new Numbers();
		Numbers n2=new Numbers();
		
		try {
			n1.start();
			n1.join();
			
			n2.start();
		}catch(Exception e) {}
	}
}
