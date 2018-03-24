
public class PrintDemo {

	public static void main(String[] args) {
        String aString = "abc";
		
		System.out.println("String output:");
		System.out.println("START1234567890");
		System.out.printf("START%sEND %n", aString);
		System.out.printf("START%4sEND %n", aString);
		System.out.printf("START%2sEND %n", aString);
		System.out.println();

		
	}

}
