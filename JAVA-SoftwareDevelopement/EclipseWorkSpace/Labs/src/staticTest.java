
public class staticTest {
	public static int port = 80;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = Tool.add(1,1);
//		System.out.println(sum);
//		
		staticTest obj1 = new staticTest();
		staticTest obj2 = new staticTest();
		
		System.out.println(staticTest.port);
		System.out.println(obj1.port);
		System.out.println(obj2.port);
		
		staticTest.port = 1234;
		System.out.println(obj1.port);
		obj2.port = 5678;
		System.out.println(obj1.port);
	}

}
