import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		Double input, guess, temp, r;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextDouble();
		guess = input / 2;
		while (true) {
			r = input / guess;
			temp = (guess + r) / 2;
			if (temp > guess) {
				if ((Math.abs(temp - guess) / guess) < 0.01) {
					guess = temp;
					break;
				}
			} else {
				if ((Math.abs(temp - guess) / temp) < 0.01) {
					guess = temp;
					break;
				}
			}
			guess = temp;
		}
		// System.out.printf("%.2f", guess);
		System.out.println(decimalFormat.format(guess));
		// System.out.println(new BigDecimal(guess).stripTrailingZeros());
		scanner.close();
	}

}
// BigDecimal stripTrailingZeros() :Returns a BigDecimal which is numerically
// equal to this one but with any trailing zeros removed from the
// representation.
