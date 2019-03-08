package model;


public class RunningNumbers implements Runnable{

	private String threadName;
	private Countable countable;

	public RunningNumbers(String threadName, Countable countable) {
		this.threadName = threadName;
		this.countable = countable;
	}

	@Override
	public void run() {
		countable.counter(threadName);
	}

}
