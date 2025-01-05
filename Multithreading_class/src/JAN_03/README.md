03-01-2025
-----------
Multithreading :
----------------
Uniprocessing :- 
----------------
In uniprocessing, only one process can occupy the memory So the major drawbacks are 

1) Memory is westage
2) Resources are westage
3) Cpu is idle

To avoid the above said problem, multitasking is introduced.

In multitasking multiple tasks can concurrently work with CPU so, our task will be completed as soon as possible.

Multitasking is further divided into two categories.

a) Process based Multitasking
b) Thread based Multitasking

[Diagram : 03-JAN]
Process based Multitasking :
----------------------------
If a CPU is switching from one subtask(Thread) of one process to another subtask of another process then it is called Process based Multitasking.

Thread based Multitasking :
---------------------------
If a CPU is switching from one subtask(Thread) to another subtask within the same process then it is called Thread based Multitasking.

What is Thread in java ?
-------------------------
A thread is light weight process and it is the basic unit of CPU which can run concurrently with another thread within the same context (process).

It is well known for independent execution. The main purpose of multithreading to boost the execution sequence.

A thread can run with another thread concurrently within the same process so our task will be completed as soon as possible.

In java whenever we define main method then JVM internally creates a thread called main thread under main group.

Program that describes that main is a Thread :
-----------------------------------------------
Whenever we define main method then JVM will create main thread internally under main group, the purpose of this main thread to execute the entire main method code.

In java there is a predefined class called Thread available in java.lang package, this class contains a predefined static factory method currentThread() which will provide currently executing Thread Object.

  public native static Thread currentThread()

Thread t = Thread.currentThread(); //static Factory Method

Thread class has provided predefined method getName() to get the name of the Thread.
                 
		 public String getName();


Program to show main is a thread without method chaning :
-----------------------------------------------------------
public class Main 
{
	public static void main(String[] args) 
	{	
      Thread t1 = Thread.currentThread();
	  System.out.println("Current thread Name is :"+t1.getName());
	}

}

Program to show main is a thread with method chaning :
-------------------------------------------------------
package com.ravi.mt;

public class MainThread 
{
	public static void main(String[] args)
	{
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread Name is :"+name);

	}

}

Note : The main pupose of main thread to execute the entire main method.
--------------------------------------------------------------
How to create user-defined thread ?
-----------------------------------
In order to create user-defined thread we can use the following two packages :

 1) By using java.lang package [JDK 1.0]
  2) By using java.util.concurrent sub package [JDK 1.5]

 
Creating Thread by using java.lang package :
--------------------------------------------
In order to create user-defined thread by using java.lang package we can use the following two techniques :

a) By extending java.lang.Thread class
b) By implementing java.lang.Runnable interface (Functional interface)
 
Note : java.lang.Thread class and java.lang.Runnable interface 
       both are available in java.lang package from JDK 1.0V.
 -------------------------------------------------------------
