package DEC_06;

class Mammal{
	 	void eat(Mammal m ) {
		System.out.println("Mammal eats food");
	}
}
class Cattle extends Mammal{
	void eat(Cattle c) {
		System.out.println("Cattle eats hay");
	}
}
class Horse  extends Cattle {
	void eat(Horse h) {
		System.out.println("Horse eats hy");
	}
}

public class Test {
	public static void main(String[] args) {
		 
		Mammal h = new Horse();
		Cattle c = new Horse();
		c.eat(c);
	}

}
