import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  scanner.useDelimiter("##");
  
  int a = scanner.nextInt();
  int b = scanner.nextInt();
  System.out.println(a);
  System.out.println(b);
}
}
