package project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LogInPage extends JFrame implements ActionListener{
	public static void main(String[] args) {
		LogInPage logInPage = new LogInPage();
		logInPage.setVisible(true);
	}

	public LogInPage(){
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("Log In");
		JTextField username = new JTextField("<Your Username>");
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setLocation(300, 200);
		username.setSize(200, 50);
//		input.setText("<Input your name here>");
		add(username);
		JTextField password = new JTextField("<Your Password>");
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setLocation(300, 250);
		password.setSize(200, 50);
		add(password);
		
		logIn = new JButton("Log In");
		logIn.setLocation(350, 300);
		logIn.setSize(100, 25);
		logIn.addActionListener(this);
		add(logIn);
		signUp = new JButton("Sign Up");
		signUp.setLocation(350, 325);
		signUp.setSize(100, 25);
		signUp.addActionListener(this);
		add(signUp);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == logIn) {
			MainPage mainPage = new MainPage();
			mainPage.setVisible(true);
			setVisible(false);
		}
		if(e.getSource() == signUp) {
			SignUpPage signUpPage = new SignUpPage();
			signUpPage.setVisible(true);
			setVisible(false);
		}
		
	}
	
	JButton logIn;
	JButton signUp;
}
