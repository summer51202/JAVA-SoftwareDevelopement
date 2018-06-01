package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class simplifiedCalculator {
	public static JTextField input = new JTextField(50);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		JFrame frame = new JFrame("Simplified Calculator");
		frame.setSize(800, 600);
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		input.setToolTipText("Enter numbers here.");
//		input.addFocusListener(new FocusListener() {
//		
//			public void focusLost(FocusEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		
//			public void focusGained(FocusEvent e) {
//				// TODO Auto-generated method stub
//				input.setText("");
//			}
//		});
		String inputString = input.getText();
		
		JButton btn1 = new JButton("+");
		JButton btn2 = new JButton("-");
		JButton btn3 = new JButton("Reset");
		JButton btn4 = new JButton("=");
		ButtonListener mb1 = new ButtonListener();
		btn1.addActionListener(mb1);
		btn2.addActionListener(mb1);
		btn3.addActionListener(mb1);
		btn4.addActionListener(mb1);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.lightGray);
		panel1.add(input);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.blue);
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(btn3);
		panel2.add(btn4);
		
		frame.setLayout(new BorderLayout());
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
	
	public static class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
//			System.out.println(e.getActionCommand());
//			System.out.println(e.getSource());
			
			String command = e.getActionCommand();
			String inputString = input.getText();
			int a;
			if(command.equals("+")) {
				System.out.println("You pressed +");
				a = Integer.parseInt(inputString);
				input.setText("");
				
				
			}else if (command.equals("-")) {
				System.out.println("You pressed -");
				a = Integer.parseInt(inputString);
				input.setText("");
			}else if (command.equals("Reset")) {
				System.out.println("You pressed Reset");
				input.setText("");
				a = 0;
			}else if (command.equals("=")) {
				System.out.println("You pressed =");
				inputString = input.getText();
				int b = Integer.parseInt(inputString);
				int c = a + b;
				input.setText(Integer.toString(c));
			}
		}
	}
}
