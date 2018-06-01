package Swing;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Connecting to server on port 8000
			Socket connectionSock = new Socket("192.168.34.190", 8000);
			DataOutputStream serverOutput = new DataOutputStream(connectionSock.getOutputStream());
			// Connection made, sending name.;
			while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Type your message:");
			String msg = scanner.nextLine();
			if(!msg.equals("")) serverOutput.writeBytes(msg + "\n");
			if (msg.equals("bye"))break;
			}
			serverOutput.close();
			connectionSock.close();
			} catch (IOException e) {
			e.printStackTrace();
			}
	}

}
