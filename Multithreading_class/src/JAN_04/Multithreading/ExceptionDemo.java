package JAN_04.Multithreading;

class Stuff extends Thread {
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Child Thread is Running , Name Is: "+name );
		
	}
	
}
public class ExceptionDemo {

	public static void main(String[] args) {
		
		 String name = Thread.currentThread().getName();
		  System.out.println(name+"thread Started");
		 
		 Stuff s1 = new Stuff();
		 Stuff s2 = new Stuff();
		 
		 s1.start();
		 s2.start();

	}

}
