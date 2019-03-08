package model;


public class CounterIncrementation implements Countable {

	@Override
	public void counter(String threadName) {
		int counter = 0;
		for(int i = 0; i <= 100; i++){
			counter++;
			System.out.println("I'm thread: " + threadName + 
					" and I'm incrementing counter, current counter value is: " + counter);
		}
		
	}

}
