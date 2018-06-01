package Swing;
import java.net.*;
import java.io.*;

public class SocketServer {

	public static void main(String[] args) {
		try{
				//Waiting for a connection on port 8000.
				ServerSocket serverSock = new ServerSocket(8000);
				Socket connectionSock = serverSock.accept();
				BufferedReader clientInput = new BufferedReader(new InputStreamReader(connectionSock.getInputStream()));
				DataOutputStream clientOutput = new DataOutputStream(connectionSock.getOutputStream());
				//Connection made, waiting for client to send their name.
				String clientText = clientInput.readLine();
				System.out.println("From Client: "+clientText);
				//reply message
				String replyText = "Hello! I am the server...\n" ;
				clientOutput.writeBytes(replyText);
				clientOutput.close();
				clientInput.close();
				connectionSock.close();
				serverSock.close();
			}
			catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
	}

}
