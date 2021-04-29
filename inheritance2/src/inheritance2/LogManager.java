package inheritance2;

public class LogManager {
//bad code sample
	public void log(int logger) {
		if(logger == 1) {
			//file logger codes
		}else if(logger == 2) {
			//database logger codes
		}else {
			//email logger codes
		}
	}
}


//1 - Database
//2 - File
//3 - Email