
public class AnimalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Two animals have the same data:
		Animal a = new Animal("Fred");
		Animal b = new Animal("Fred");
		
		if(a == b) {
			System.out.println("(a == b) is true");
		}
		else
		{
			System.out.println("(a == b) is false");
		}
		
		
		if(a.equals(b)) {
			System.out.println("(a.equals(b)) is true");
		}
		else
		{
			System.out.println("(a.equals(b)) is false");
		}
	}

}
