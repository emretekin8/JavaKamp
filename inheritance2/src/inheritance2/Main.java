package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		//deneme
		CustomerManager customerManager1 = new CustomerManager();
		customerManager1.add(new EmailLogger());
		
		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.add(new FileLogger());
		
		CustomerManager customerManager3 = new CustomerManager();
		customerManager3.add(new DatabaseLogger());
		

	}

}
