package JAN_04.Multithreading;

class test extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread is running !!!");
		
	}
}

public class UserThread {

	public static void main(String[] args) {
		System.out.println("Main thread startd !!!!");
		
		test t1 = new test();
		t1.start();
		System.out.println("Main thred ended");

	}

}
