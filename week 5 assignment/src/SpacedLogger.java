
public class SpacedLogger extends App implements Logger {
	public void Log(String log) {
		for (char lo : log.toCharArray())
			System.out.print(lo + " ");
	}
	
	
	public void Error(String error) {
		System.out.print("Error: ");
		for (char er : error.toCharArray())
			System.out.print(er + " ");
	}

}
