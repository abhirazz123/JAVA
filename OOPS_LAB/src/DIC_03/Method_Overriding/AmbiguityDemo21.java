package DIC_03.Method_Overriding;

public class AmbiguityDemo21
{
	public static void main(int[] args) 
	{
		System.out.println("int array variable");
	}
	
	public static void main(String args) 
	{
		System.out.println("String variable");
	}
}