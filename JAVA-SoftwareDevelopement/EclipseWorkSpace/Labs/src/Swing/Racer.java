package Swing;

public class Racer extends Thread{
	public void run() {
		RaceConditionTest.increase();
	}
}
