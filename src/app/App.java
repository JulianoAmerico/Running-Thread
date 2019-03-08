package app;

import model.Countable;
import model.CounterDecrementation;
import model.CounterIncrementation;
import model.RunningNumbers;

public class App {

	public static void main(String[] args) {
		Countable ci = new CounterIncrementation();
		Countable cd = new CounterDecrementation();
		
		RunningNumbers[] r = new RunningNumbers[2];
		r[0] = new RunningNumbers("Thread - 0", ci);
		r[1] = new RunningNumbers("Thread - 1", cd);
		
		Thread[] t = new Thread[2];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(r[i]);
			t[i].start();
		}
	}

}
