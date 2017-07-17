package exercise_singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile  static ChocolateBoiler chocolateBoiler;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if (chocolateBoiler == null) {
			synchronized (ChocolateBoiler.class) {
				if (chocolateBoiler == null) {
					chocolateBoiler = new ChocolateBoiler();
				}
			}
			
		} 
		return chocolateBoiler;
	}
}
