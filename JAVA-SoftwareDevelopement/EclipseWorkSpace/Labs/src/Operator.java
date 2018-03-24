
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 30;
		int y = 2;
		System.out.println(x*y+9/3);
		System.out.println(x*y/5);
		System.out.println(15.0/2);
		System.out.println(15/2);
		int a = 10;
		int b = 3;
		double c = 10/3;
		double d = 10/(double)3;
		System.out.println(c);
		System.out.println(d);
		int value1 = 3;
		int value2 = 4;
		int result = 0;
		result = value1++ * value2--;
		System.out.println("Post increment/decrement: " + result);
		result = ++value1 * --value2; 
		System.out.println("Pre increment/decrement: " + result);
	}

}
