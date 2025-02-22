/*1) Find the output
 class Demo {
	int x;
	int y;
	public Demo() {
		x = 10;
		y = x++;
		x = this.y + this.x;
		this.y = x + this.y;
	}
	public Demo(int x, int y) {
		this.x = this.x + x;
		this.y = this.x + y;
	}
}
public class Test {
	public static void main(String[] args) {
		System.out.print(new Demo().x + new Demo().y);
		Demo demo = new Demo(20, 45);
		System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
	}
}


2) Find the output

class Demo {
	int x;
	int y;
	public Demo() {
		x = 10;
		y = x++;
	}
	public Demo(int x, int y) {
		this.x += this.x + x++;
		this.y -= this.x + --y;
	}
}
public class Test {
	public static void main(String[] args) {
		System.out.print(new Demo().x + new Demo().y);
		Demo demo = new Demo(30, 50);
		System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
	}
}

3) Find the output

  class Example {
	int x = 10;
	int y = 20;
	public Example()
	{
		x = 90;
		y = y+80;
	}
}
public class Test {
	public static void main(String[] args) {
		Example e1 = new Example();
		Example e2 = new Example();
		e2.x = 25;
		e1.x = e2.y + 10;
		System.out.println(e1.x + " " + e1.y);
		System.out.println(e2.x + " " + e2.y);
	}
}

4) Find the output

public class Exam {
	int eid;
	String ename;
	String company;
	public String toString() {
		return "eid:" + eid + "\n" + "ename:" + ename + "\n" + "company:" + company + "\n";
	}
	public static void main(String[] args) {
		Exam e1 = new Exam();
		e1.eid = 7279;
		e1.ename = "Ganesh";
		e1.company = "Naresh IT";
		e1 = new Exam();
		System.out.println(e1.toString());
	}
}

Q5) Answer 

What is the default value of an instance variable in Java?
 
a) 0 (zero)

b) Null

c) Depends on the data type

d) Undefined
--------------------------------------------------------------------

Program: 1
-----------
Create a class Address (Business Logic Class)
Instance Variables: 
   private String cityName;
   private String districtName;
   private String stateName;
Create a parameterized constructor initialize the instance variable of the class.

Override toString() from Object class to print Address class properties.

Create a class Employee (Business Logic Class)
Instance Variables: 
   private int empId;
   private String empName;
   private Address address; //HAS-A relation
Create a parameterized constructor initialize the instance variable of the class.

Override toString() from Object class to print Employee class properties.

Create a class Main (Executable Logic Class) which contains main method to print Employee class properties using toString() method.

Program: 2
-----------
Create a class Order (Business Logic Class)
Instance Variables: 
   private int orderId;
   private String itemName;
   private double itemPrice;
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Order class properties.

Create a class Customer (Business Logic Class)
Instance Variables: 
   private int customerId;
   private String customerName;
   private String customerAddress;
   private Order order; //HAS-A relation
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Customer class properties.

Create a class Zomato (Executable Logic Class) which contains main method to print Customer class properties using toString() method.
*/