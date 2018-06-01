package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.INPUT_STREAM;

public class MyButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getActionCommand());
//		System.out.println(e.getSource());
		
		String command = e.getActionCommand();
		String inputString = 
		if(command.equals("+")) {
			System.out.println("You pressed +");
		}else if (command.equals("-")) {
			System.out.println("You pressed -");
		}else if (command.equals("Reset")) {
			System.out.println("You pressed Reset");
		}
	}
}
