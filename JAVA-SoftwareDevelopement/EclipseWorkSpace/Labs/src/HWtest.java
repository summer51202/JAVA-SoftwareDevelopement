import java.util.Scanner;

public class HWtest {

	public static void main(String[] args) {
		// TODO -generated method stub
		System.out.println("Please enter an input string:");
		Scanner scanner = new Scanner(System.in);
		
		String str1, str2, str3;
		str1 = scanner.nextLine();
		String[] tokens = str1.split(" ");
		for (String token : tokens) {
			if (token.charAt(0) == 'a' || token.charAt(0) == 'e' || token.charAt(0) == 'i' || token.charAt(0) == 'o'
					|| token.charAt(0) == 'u') {
				System.out.print(token.replaceFirst(String.valueOf(token.charAt(0)),
						String.valueOf(token.charAt(0)).toUpperCase()) + "ay ");
			} else {
				System.out.print(token.substring(1).replaceFirst(String.valueOf(token.substring(1).charAt(0)),
						String.valueOf(token.substring(1).charAt(0)).toUpperCase()) + token.charAt(0) + "ay ");
			}
		}
	}
}
