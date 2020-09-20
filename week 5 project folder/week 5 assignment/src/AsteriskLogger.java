
public class AsteriskLogger extends App implements Logger {
public void Log(String log) {
	System.out.println("***" + log + "***");
}
public void Error(String error) {
	System.out.println("***********************");
	System.out.println("*** " + error + " ***");
	System.out.println("***********************");
}
}
