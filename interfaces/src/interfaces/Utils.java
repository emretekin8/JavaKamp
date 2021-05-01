package interfaces;

public class Utils {//utilities
	
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger : loggers) {
			logger.log(message);
		}
	}

}
