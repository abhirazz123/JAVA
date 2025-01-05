package JAN_01;
import java.io.InputStream;
import java.util.*;
class CarStoppedException extends Exception {
   public CarStoppedException(String message) {
       super(message);
   }
}

class CarPunctureException extends Exception {
   public CarPunctureException(String message) {
       super(message);
   }
}

class CarHeatException extends Exception {
   public CarHeatException(String message) {
       super(message);
   }
}


class CarTest {
   public static void stop(String action) throws CarStoppedException {
       if ("stop".equalsIgnoreCase(action)) {
           throw new CarStoppedException("Car stopped for some reason.");
       } else {
           System.out.println("Car not stalled.");
       }
   }

   public static void puncture(String action) throws CarPunctureException {
       if ("puncture".equalsIgnoreCase(action)) {
           throw new CarPunctureException("Car is punctured.");
       } else {
           System.out.println("Car not punctured.");
       }
   }

   public static void carHeat(int temperature) throws CarHeatException {
       if (temperature > 50) {
           throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
       } else {
           System.out.println("Car temperature normal.");
       }
   }
}


public class CarUser {
   public static void main(String[] args) {
	   
	   Scanner sc = Scanner(System.in);
	   System.out.println("Enter the your choice");
	 
	   
	   
       try {
           
           CarTest.stop("stop");
       } catch (CarStoppedException e) {
           System.out.println(e.getMessage());
       }

       try {
       
           CarTest.stop("go");
       } catch (CarStoppedException e) {
           System.out.println(e.getMessage());
       }

       try {
            
           CarTest.puncture("puncture");
       } catch (CarPunctureException e) {
           System.out.println(e.getMessage());
       }

       try {
           
           CarTest.puncture("move");
       } catch (CarPunctureException e) {
           System.out.println(e.getMessage());
       }

       try {
          
           CarTest.carHeat(60);
       } catch (CarHeatException e) {
           System.out.println(e.getMessage());
       }

       try {
            
           CarTest.carHeat(40);
       } catch (CarHeatException e) {
           System.out.println(e.getMessage());
       }
   }

private static Scanner Scanner(InputStream in) {
	// TODO Auto-generated method stub
	return null;
}
}
