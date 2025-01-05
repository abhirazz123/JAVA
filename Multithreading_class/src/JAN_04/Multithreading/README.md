04-01-2025
-----------
Creating a user thread by extends Thread class approach :
----------------------------------------------------------
public synchronized void start() :
-----------------------------------
start() is a predefined non static method of Thread class which internally performs the following two tasks :

1) It will make a request to the O.S to assign a new thread for concurrent execution.

2) It will implicitly call run() method on the current object.
-------------------------------------------------------------------

package com.ravi.mi;

class Test extends Thread
{
	@Override
	public void run()
	{
		
		System.out.println("Child Thread is running!!!"); 
	}
}

public class UserThread 
{
	public static void main(String[] args)
	{
		System.out.println("Main thread started!!!"); 
		
		Test t1 = new Test();
		t1.start();
				
		System.out.println("Main thread ended!!!"); 

	}

}

In the above program, we have two threads, main thread which is responsible to execute main method and Thread-0 thread which is 
responsible to execute run() method. [04-JAN-25]

In entire Multithreading start() is the only method which is responsible to create a new thread.
------------------------------------------------------------------
public final boolean isAlive() :-
-----------------------------
It is a predefined non static method of Thread class through which we can find out whether a thread has started or not ?

As we know a new thread is created/started after calling start() method so if we use isAlive() method before start() method, 
it will return false but if the same isAlive() method if we invoke after the start() method, it will return true.

We can't restart a thread in java if we try to restart then It will generate an exception i.e java.lang.IllegalThreadStateException


package com.ravi.is_alive;

class Demo extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child Thread is running in a separate Stack");
	}
}

public class IsAlive {

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		System.out.println("Is child thread started before start() :"+d1.isAlive());
		
		d1.start();
		System.out.println("Is child thread started after start():"+d1.isAlive());
		
		d1.start();  //java.lang.IllegalThreadStateException 
	
	}
}
-------------------------------------------------------------------
package com.ravi.basic;

class Stuff extends Thread
{
	@Override
	public void run() 
	{		
		String name = Thread.currentThread().getName();		
		System.out.println("Child Thread is Running, name is :"+name);
	}	
}
public class ExceptionDemo 
{
	public static void main(String[] args)
	{		
		String name = Thread.currentThread().getName();		
	    System.out.println(name+" thread started");		
	
		Stuff s1 = new Stuff(); 
		Stuff s2 = new Stuff(); 		
				
		s1.start();
		s2.start();
		
		System.out.println(10/0);
		
		System.out.println("Main Thread Ended");
	}

}

Note :- Here main thread is interrupted due to AE but still child thread will be executed because child threads are executing with separate Stack