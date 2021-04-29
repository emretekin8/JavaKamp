package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer emre = new IndividualCustomer();
		emre.customerNumber = "1011";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "1370";

		UnionCustomer sendika = new UnionCustomer();
		sendika.customerNumber = "2416";

		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {emre, sendika, hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
