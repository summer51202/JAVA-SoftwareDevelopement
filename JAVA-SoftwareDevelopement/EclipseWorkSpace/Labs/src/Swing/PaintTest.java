package Swing;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Graphics;


public class PaintTest extends JFrame{
	public static void main(String[] args) {
		PaintTest frame = new PaintTest();
		frame.setVisible(true);
	}
	public PaintTest(){
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
	}
	public void paint(Graphics g){
		super.paint(g);
		g.drawRect(100, 100, 300, 200);
	}
}
