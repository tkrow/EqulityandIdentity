
public class Client {

	public static void main(String[] args) {
		
		// Comparing primitives
		int myScore = 100;
		int yourScore = 98;
		int highScore = myScore;
		
		if (highScore == myScore) {
			System.out.println("(highScore == myScore) is true");
		}
		
		
		// Comparing objects
		String one = new String("x");
		String two = new String("y");
		String three = one;
		
		if (one == three) {
			System.out.println("(one == three) is true");
		}
		
		
		// Comparing data
		if (one.contentEquals(three)) {
			System.out.println("(one.contentEquals(three)) is true");
		}
		
		
		// Same data, different objects
		String myPassword = "Bosco";
		String yourPassword = "Bosco";
		
		if (myPassword == yourPassword) {
			System.out.println("(myPassword == yourPassword) is true");
		}
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		// Output virtual address:
		System.out.println("o1: " + o1);
		System.out.println("o2: " + o2);
		
		if (o1 == o2) {
			System.out.println("(o1 == o2) is true");
		}
		else {
			System.out.println("(o1 == o2) is false");
		}
		
		// Comparing data
		if (o1.equals(o2)) {
			System.out.println("(o1.equals(o2)) is true");
		}
		else {
			System.out.println("(o1.equals(o2)) is false");
		}
	}
}
