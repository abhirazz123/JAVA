package DIC_16;

interface Add1
{
	int add(int b);
	//int add(int a, int b);
}
public class FunctionalInterface3 {
	public static void main(String[] args) {
		int a = 21;
		Add1 add = b -> b+b;
		System.out.println(add.add(a));
	}
}