
public class AnonymousObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousObjectTest obj = new AnonymousObjectTest();
		obj.showMessage(new String("I am a anonymous object."));
	}
/**
This message is to show a given message
@param  message The message to be shown
*/
	public void showMessage(String message){
		System.out.println(message);
		}
}
