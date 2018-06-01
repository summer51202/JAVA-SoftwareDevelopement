package HW6;

import java.util.Arrays;

public class Subtraction implements IOperation{
	public String perform(String num1, String num2) {
//		return String.valueOf(Integer.valueOf(num1) - Integer.valueOf(num2));
		Boolean num1IsNeg = false;
		Boolean num2IsNeg = false;
		int digits;
		String[] inputNumber1;
		String[] inputNumber2;
		String[] inputNumberSum;
		Boolean carryFlag = false;
		Boolean abdFlag = false;
		Boolean absNum1IsMax = false;
		Boolean resultIsNeg = false;
		String result = "";
		
		if(num1.startsWith("-")) {
			num1 = num1.substring(1);
			num1IsNeg = true;
		}
		if(num2.startsWith("-")) {	
			num2 = num2.substring(1);
			num2IsNeg = true;
		}
		digits = Math.max(num1.length(), num2.length());
		inputNumber1 = new String[digits];
		inputNumber2 = new String[digits];
		inputNumberSum = new String[digits];
		carryFlag = false;
		abdFlag = false;
		absNum1IsMax = false;
		Arrays.fill(inputNumber1, "0");
		Arrays.fill(inputNumber2, "0");
		
		if(digits == num1.length()) {
			for(int i = 0; i < digits; ++i) {
				inputNumber1[i] = num1.substring(i, i+1);
				if((num1.length() - num2.length()) + i < digits)
					inputNumber2[(num1.length() - num2.length()) + i] = num2.substring(i, i+1);
			}
			absNum1IsMax = true;
		}else {
			for(int i = 0; i < digits; ++i) {
				inputNumber2[i] = num2.substring(i, i+1);
				if((num2.length() - num1.length()) + i < digits)
					inputNumber1[(num2.length() - num1.length()) + i] = num1.substring(i, i+1);
			}
		}
		
		if(!num1IsNeg && !num2IsNeg) { // num1:+ num2:+
			if(absNum1IsMax) { // num1 - num2
				for(int i = digits - 1; i >= 0; --i) {
					if(abdFlag) {
						abdFlag = false;
						if(Integer.valueOf(inputNumber1[i]) - 1 - Integer.valueOf(inputNumber2[i]) < 0) {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) - 1 + 10 - Integer.valueOf(inputNumber2[i]));
							abdFlag = true;	
							if(i == 0) { // num1 - num2 < 0, if num1 num2 have same digits
								resultIsNeg = true;
								for(int j = 0; j < digits; ++j) {
									if(j == digits - 1) {
										inputNumberSum[j] = String.valueOf(9 - Integer.valueOf(inputNumberSum[j]) + 1);
									}else {
										inputNumberSum[j] = String.valueOf(9 - Integer.valueOf(inputNumberSum[j]));
									}
								}
							}
						} else {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) - 1 - Integer.valueOf(inputNumber2[i]));
						}
					} else {
						abdFlag = false;
						if(Integer.valueOf(inputNumber1[i]) - Integer.valueOf(inputNumber2[i]) < 0) {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + 10 - Integer.valueOf(inputNumber2[i]));
							abdFlag = true;	
						} else {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) - Integer.valueOf(inputNumber2[i]));
						}
					}
				}
				if(resultIsNeg)
					result = "-";
				for(int i = 0; i < digits; ++i) {
					result = result.concat(inputNumberSum[i]);
				}
			} else { // -|num2 - num1|
				resultIsNeg = true;
				for(int i = digits - 1; i >= 0; --i) {
					if(abdFlag) {
						abdFlag = false;
						if(Integer.valueOf(inputNumber2[i]) - 1 - Integer.valueOf(inputNumber1[i]) < 0) {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber2[i]) - 1 + 10 - Integer.valueOf(inputNumber1[i]));
							abdFlag = true;	
						} else {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber2[i]) - 1 - Integer.valueOf(inputNumber1[i]));
						}
					} else {
						abdFlag = false;
						if(Integer.valueOf(inputNumber2[i]) - Integer.valueOf(inputNumber1[i]) < 0) {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber2[i]) + 10 - Integer.valueOf(inputNumber1[i]));
							abdFlag = true;	
						} else {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber2[i]) - Integer.valueOf(inputNumber1[i]));
						}
					}	
				}
				if(resultIsNeg)
					result = "-";
				for(int i = 0; i < digits; ++i) {
					result = result.concat(inputNumberSum[i]);
				}
			}
		} else if(num1IsNeg && num2IsNeg) { // num1:- num2:-
			resultIsNeg = true;
			if(absNum1IsMax) { // -(|num1| - |num2|)
				for(int i = digits - 1; i >= 0; --i) {
					if(abdFlag) {
						abdFlag = false;
						if(Integer.valueOf(inputNumber1[i]) - 1 - Integer.valueOf(inputNumber2[i]) < 0) {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) - 1 + 10 - Integer.valueOf(inputNumber2[i]));
							abdFlag = true;	
							if(i == 0) { // |num1| - |num2| < 0, if num1 num2 have same digits
								resultIsNeg = false;
								for(int j = 0; j < digits; ++j) {
									if(j == digits - 1) {
										inputNumberSum[j] = String.valueOf(9 - Integer.valueOf(inputNumberSum[j]) + 1);
									}else {
										inputNumberSum[j] = String.valueOf(9 - Integer.valueOf(inputNumberSum[j]));
									}
								}
							}
						} else {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) - 1 - Integer.valueOf(inputNumber2[i]));
						}
					} else {
						abdFlag = false;
						if(Integer.valueOf(inputNumber1[i]) - Integer.valueOf(inputNumber2[i]) < 0) {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + 10 - Integer.valueOf(inputNumber2[i]));
							abdFlag = true;	
						} else {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) - Integer.valueOf(inputNumber2[i]));
						}
					}	
				}
				if(resultIsNeg)
					result = "-";
				for(int i = 0; i < digits; ++i) {
					result = result.concat(inputNumberSum[i]);
				}
			} else { // |num2| - |num1|
				for(int i = digits - 1; i >= 0; --i) {
					if(abdFlag) {
						abdFlag = false;
						if(Integer.valueOf(inputNumber2[i]) - 1 - Integer.valueOf(inputNumber1[i]) < 0) {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber2[i]) - 1 + 10 - Integer.valueOf(inputNumber1[i]));
							abdFlag = true;	
						} else {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber2[i]) - 1 - Integer.valueOf(inputNumber1[i]));
						}
					} else {
						abdFlag = false;
						if(Integer.valueOf(inputNumber2[i]) - Integer.valueOf(inputNumber1[i]) < 0) {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber2[i]) + 10 - Integer.valueOf(inputNumber1[i]));
							abdFlag = true;	
						} else {
							inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber2[i]) - Integer.valueOf(inputNumber1[i]));
						}
					}	
				}
				if(resultIsNeg)
					result = "-";
				for(int i = 0; i < digits; ++i) {
					result = result.concat(inputNumberSum[i]);
				}
			}
		} else if(!num1IsNeg && num2IsNeg) { // num1:+ num2:-
			// num1 + |num2|
			for(int i = digits - 1; i >= 0; --i) { 
				if(carryFlag) {
					carryFlag = false;
					if(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) + 1 >= 10) {
						inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) + 1 - 10);
						carryFlag = true;
						if(i == 0) {
							result = result.concat("1");
						}
					} else {
						inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) + 1);
					}
				} else {
					carryFlag = false;
					if(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) >= 10) {
						inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) - 10);
						carryFlag = true;
					} else {
						inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]));
					}
				}
			}
			if(resultIsNeg)
				result = "-";
			for(int i = 0; i < digits; ++i) {
				result = result.concat(inputNumberSum[i]);
			}
		} else if(num1IsNeg && !num2IsNeg) { // num1:- num2:+
			// - (|num1| + num2)
			resultIsNeg = true;
			if(resultIsNeg)
				result = "-";
			for(int i = digits - 1; i >= 0; --i) {
				if(carryFlag) {
					carryFlag = false;
					if(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) + 1 >= 10) {
						inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) + 1 - 10);
						carryFlag = true;
						if(i == 0) {
							result = result.concat("1");
						}
					} else {
						inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) + 1);
					}
				} else {
					carryFlag = false;
					if(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) >= 10) {
						inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]) - 10);
						carryFlag = true;
					} else {
						inputNumberSum[i] = String.valueOf(Integer.valueOf(inputNumber1[i]) + Integer.valueOf(inputNumber2[i]));
					}
				}
			}
			for(int i = 0; i < digits; ++i) {
				result = result.concat(inputNumberSum[i]);
			}
		} else {
			System.out.println("error");
		}
		
		return result;
	}
}
