package NOV_28.Polymorphism.Constructor_Overloading;
class Addition
{
	public int add(int x, int y ) {
		return x+y;
	}
	public double add(double x, double y ) {
		return x+y;
	}
	public String  add(String  x, String  y ) {
		return x+y;
	}
}


public class MethodOverloading {

	public static void main(String[] args) 
	{
		Addition a1 = new Addition();
		int sum = a1.add(12, 14);
		System.out.println("Sum of two integer is:"+sum);
		
		double add = a1.add(2.3,8.9);
		System.out.println("sum of two integer is :"+add);
		
		String concat = a1.add("Radhe", "Radhe");
		System.out.println("String after Concatenation:"+concat);
		
	}

}
