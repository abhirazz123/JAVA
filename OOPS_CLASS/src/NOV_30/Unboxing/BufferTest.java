package NOV_30.Unboxing;

public class BufferTest 
{
	public static void main(String[] args) {
		Integer i =127;
		Integer j = 127;
		System.out.println(i==j);
		
		Integer a = 128;
		Integer b = 128;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		Integer p = 130; 
		Integer q = 130;
		System.out.println(p.equals(q));
	}
}
