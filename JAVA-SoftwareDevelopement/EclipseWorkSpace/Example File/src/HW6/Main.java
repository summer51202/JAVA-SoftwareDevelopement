package HW6;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		ArrayList<String> input = new ArrayList<>();
//		while(scanner.hasNextLine()) {
//			input.add(scanner.next());
//		}
//		int oTimes = input.size();
//		System.out.println("0");
		String input = scanner.nextLine();
		String a = getResult(input);
		System.out.println(a);
	}
	public static String getResult(String input) {
		String[] elements = input.split(" ");
		int oTimes = (elements.length - 1)/2;
		String[] operator = new String[oTimes];
		for(int i = 0; i < oTimes; ++i) {
			operator[i] = elements[i*2 + 1];
		}
		IOperation operation;
		String result = "";
		for(int i = 1; i <= oTimes; ++i) {
//			System.out.println(operator[i-1]);
			switch (operator[i-1]) {
			case "+":
				operation = new Addition();
				elements[2*i] = operation.perform(elements[2*(i-1)], elements[2*i]);
				result = elements[2*i];
				break;
			case "-":
				operation = new Subtraction();
				elements[2*i] = operation.perform(elements[2*(i-1)], elements[2*i]);
				result = elements[2*i];
				break;
			case ">":
				operation = new Comparison();
				result = operation.perform(elements[2*(i-1)], elements[2*i]);
				if(!result.equals("first")) {
					result = "false";
					return result;
				} 
				result = "true";
				break;
			case "<":
				operation = new Comparison();
				result = operation.perform(elements[2*(i-1)], elements[2*i]);
				if(!result.equals("second")){
					result = "false";
					return result;
				} 
				result = "true";
				break;	
			case "=":
				operation = new Comparison();
				result = operation.perform(elements[2*(i-1)], elements[2*i]);
				if(!result.equals("same")){
					result = "false";
					return result;
				} 
				result = "true";
				break;
			default:
				break;
			}
		}
		return result;
	}
}
