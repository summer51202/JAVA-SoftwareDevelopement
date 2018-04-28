import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in = "Hello,World,Java";
		StringTokenizer st = new StringTokenizer(in, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
