package Swing;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.JFrame;

public class IconDemo extends JFrame implements ActionListener{
	public static void main(String[] args) {
		IconDemo frame = new IconDemo();
		frame.setVisible(true);
	}
	public IconDemo(){
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		try {
			ImageIcon icon = new ImageIcon(new URL("http://www.zhaodanji.com/uploadfile/2016/0401/20160401014847336.jpg"));
			JLabel lb = new JLabel(icon);
			lb.setText("Hello!");
			add(lb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent e){
	}
}