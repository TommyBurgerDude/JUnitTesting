package mod1;

public class Counter {
	
	//Variable used for counting
	int count = 0;
	
	//Increase Count
	public int increment() {
		return ++count;
	}
	
	//Decrease Count
	public int decrement() {
		return --count;
	}
	
	//Getter - Get Count
	public int getCount() {
		return count;
	}
}
