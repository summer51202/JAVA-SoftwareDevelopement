import java.text.DecimalFormat;
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double coef_a = 0.0;
		double coef_b = 0.0;
		double coef_c = 0.0;
		double root_1 = 0.0;
		double root_2 = 0.0;
		String numFormat = "";

		coef_a = scanner.nextDouble();
		coef_b = scanner.nextDouble();
		coef_c = scanner.nextDouble();
		numFormat = scanner.next();

		DecimalFormat inputFormat = new DecimalFormat(numFormat);

		root_1 = (-coef_b + Math.sqrt(Math.pow(coef_b, 2) - 4 * coef_a * coef_c)) / (2 * coef_a);
		root_2 = (-coef_b - Math.sqrt(Math.pow(coef_b, 2) - 4 * coef_a * coef_c)) / (2 * coef_a);
		System.out.println(inputFormat.format(root_1));
		System.out.println(inputFormat.format(root_2));
		scanner.close();
	}

}
// double Scanner.nextDouble(): Scans the next token of the input as a double.
// DecimalFormat(string pattern)<Constructor> : Creates a DecimalFormat using the given pattern and the symbols for the default locale
// String DecimalFormat.format(double number) : Formats a double to produce a string.
// static double Math.pow(double a, double b) : Returns the value of the first argument raised to the power of the second argument.
// static double Math.sqrt(double a) : Returns the correctly rounded positive square root of a double value.