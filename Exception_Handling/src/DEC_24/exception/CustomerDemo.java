package DEC_24.exception;
import java.util.*;
public class CustomerDemo {

	public static void main(String[] args) {
		 System.out.println("Welcome client, Welcome to my application");
		 Scanner sc = new Scanner(System.in);
		 try {
			 System.out.println("Enter the value of a  : ");
			 int a = sc.nextInt();
			 
			 System.out.println("Enter the value of b : ");
			 int b = sc.nextInt();
			 
			 int result = a/b;
			 
			 System.out.println("Result : "+result);
			 
			 }
		 catch(Exception e) {
			 System.err.println("sir , please don't out zero hare");
		 }
		 System.out.println("Thank you client, have a nace day");

	}

}
