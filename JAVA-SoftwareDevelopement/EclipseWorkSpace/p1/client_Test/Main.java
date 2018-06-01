package client_Test;

public class Main extends Thread{

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}

	public void run() {
		ChatClient chatClient = new ChatClient();
		chatClient.start();

//		chatClient.disconnect();
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//		}
//		chatClient.reconnect();
	}
	
}
