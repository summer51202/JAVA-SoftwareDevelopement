package ObjectOuputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

	public static void main(String[] args) {
		
		Student stu = new Student("Hacker", 20);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\output2.obj"));
			oos.writeInt(123);
			oos.writeObject(stu);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
