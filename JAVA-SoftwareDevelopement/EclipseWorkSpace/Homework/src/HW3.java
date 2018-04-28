import java.util.ArrayList;
import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		int inputValue = Integer.valueOf(input.substring(2));

		if (input.startsWith("X")) {
			int checkValue = inputValue;

			while (checkValue % 2 == 0) {
				checkValue /= 2;
			}
			while (checkValue % 3 == 0) {
				checkValue /= 3;
			}
			while (checkValue % 5 == 0) {
				checkValue /= 5;
			}
			if (checkValue == 1) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else if (input.startsWith("Y")) {
			ArrayList<Integer> Seq = new ArrayList<>();
			int number = 1;
			Seq.add(0);
			Seq.add(1);

			for (int i = 2; number < inputValue; ++i) {
				int checkValue = i;

				while (checkValue % 2 == 0) {
					checkValue /= 2;
				}
				while (checkValue % 3 == 0) {
					checkValue /= 3;
				}
				while (checkValue % 5 == 0) {
					checkValue /= 5;
				}
				if (checkValue == 1) {
					number++;
					Seq.add(i);

				}

			}
			System.out.println(Seq.get(inputValue));
		} else {
			System.out.println("Wrong Input");
		}
		scanner.close();
	}

}

// static Integer Integer.valueOf(String s) : Returns an Integer object holding
// the value of the specified String.
// String String.substring(int beginIndex)
// boolean String.starsWith(String prefix)
// a /= b means a = a/b;
