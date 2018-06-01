package HW6;

import java.util.Arrays;

public class Comparison implements IOperation{
	public String perform(String num1, String num2) {
//		if(Integer.valueOf(num1) > Integer.valueOf(num2)) {
//			return "first";
//		}else if(Integer.valueOf(num1) < Integer.valueOf(num2)) {
//			return "second";
//		}else {
//			return "same";
//		}
		Boolean bothNumAreNeg = false;
		int digits;
		String[] inputNumber1;
		String[] inputNumber2;
//		String[] inputNumberSum;
//		Boolean carryFlag = false;
//		Boolean abdFlag = false;
//		Boolean absNum1IsMax = false;
		String result = "";
		
		if(!num1.startsWith("-") && num2.startsWith("-")) { // num1:+ num2:- 
			return "first";
		} else if (num1.startsWith("-") && !num2.startsWith("-")) { // num1:- num2:+
			return "second";
		} else if (!num1.startsWith("-") && !num2.startsWith("-")) { // num1:+ num2:+
			
		} else if (num1.startsWith("-") && num2.startsWith("-")) { // num1:- num2:-
			num1 = num1.substring(1);
			num2 = num2.substring(1);
			bothNumAreNeg = true;
		} else {
			System.out.println("error");
		}
		
		digits = Math.max(num1.length(), num2.length());
		inputNumber1 = new String[digits];
		inputNumber2 = new String[digits];
		Arrays.fill(inputNumber1, "0");
		Arrays.fill(inputNumber2, "0");
		
		if(digits == num1.length()) {
			for(int i = 0; i < digits; ++i) {
				inputNumber1[i] = num1.substring(i, i+1);
				if((num1.length() - num2.length()) + i < digits)
					inputNumber2[(num1.length() - num2.length()) + i] = num2.substring(i, i+1);
			}
//			absNum1IsMax = true;
		}else {
			for(int i = 0; i < digits; ++i) {
				inputNumber2[i] = num2.substring(i, i+1);
				if((num2.length() - num1.length()) + i < digits)
					inputNumber1[(num2.length() - num1.length()) + i] = num1.substring(i, i+1);
			}
		}
		if(!bothNumAreNeg) {
			for(int i = 0; i < digits; ++i) {
				if(Integer.valueOf(inputNumber1[i]) > Integer.valueOf(inputNumber2[i])) 
					return "first";
				if(Integer.valueOf(inputNumber2[i]) > Integer.valueOf(inputNumber1[i])) 
					return "second";
				if(i == digits - 1) {
					return "same";
				}
					
			}
		} else {
			for(int i = 0; i < digits; ++i) {
				if(Integer.valueOf(inputNumber2[i]) > Integer.valueOf(inputNumber1[i])) 
					return "first";
				if(Integer.valueOf(inputNumber1[i]) > Integer.valueOf(inputNumber2[i])) 
					return "second";
				if(i == digits - 1) {
					return "same";
				}
					
			}
		}
		return result;
	}
}
