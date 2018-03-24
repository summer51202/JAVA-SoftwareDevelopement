import java.util.Random;
import java.util.Scanner;

public class SelectionStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number = 24;
        if(number % 2 == 0) {
        	System.out.print("True!");
        }
        else {
        	System.out.print("False!");
        }
        int grade1 = 65;
        int grade2 = 50;
        
        System.out.println(grade1 >= 60?"Passed." : "Failed.");
        System.out.println(grade2 >= 60?"Passed." : "Failed.");
        
        String a = new String("Java");
        String b = new String("Java");
        
        System.out.print(a);
        System.out.print(b);
        
        if(a == b)
        	System.out.println("a == b");
        if(a.equals(b))
        	System.out.println("a equals to b");
        
        int evenSum = 0;
        int oddSum = 0;
        
        for(int i=1; i<=5; i++)
        {
        	if(i % 2 == 0)
        	{
        		evenSum += i;
        	}
        	else
        	{
        		oddSum += i;
        	}
        }
        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
        
        Random rand = new Random();
        for(int i=0; i<100; i++)
        {
        	int x = rand.nextInt(40);
        	System.out.println(x);
        }
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Please input a value for x:");
        int x = scanner.nextInt();
        System.out.print("Please input a value for n:");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++)
        {
        	sum = sum + x*x;
        }	
        int y = sum;
        System.out.println("y = "+ y);
	}

}
