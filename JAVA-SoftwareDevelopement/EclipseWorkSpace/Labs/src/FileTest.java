import java.io.FileInputStream;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Scanner scanner = new Scanner(new FileInputStream("d:\\test.txt"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			// String name = scanner.nextLine();
			// String id = scanner.nextLine();
			// String school = scanner.nextLine();
			// System.out.println("Name:"+name);
			// System.out.println("ID:"+id);
			// System.out.println("School:"+school);
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
