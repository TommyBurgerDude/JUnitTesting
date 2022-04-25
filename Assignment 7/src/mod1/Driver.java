package mod1;

public class Driver {

	public static void main(String[] args) {
		
		//Counter Object
		Counter counter = new Counter();
		
		//Increment Count 5 times
		for (int i = 0; i < 5; ++i) {
			counter.increment();
		}
		
		//Output Count
		System.out.println(counter.getCount());
		
	}
}
