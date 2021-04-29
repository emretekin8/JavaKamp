package inheritance2;

public class EmailLogger extends Logger {

	
	@Override  //it means: I overrided this method 
	public void log() {
		System.out.println("Email sent.\n");

	}
}
