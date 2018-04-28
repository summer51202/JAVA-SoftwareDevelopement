package Swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Click me!");
		MyButtonListener mblistener = new MyButtonListener();
		btn.addActionListener(mblistener);
		frame.add(btn);
		
		frame.setLayout(new BorderLayout());
		frame.add(btn, BorderLayout.NORTH);
		
		frame.setVisible(true);
	}

}
