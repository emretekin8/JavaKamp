package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu= false;

		
		System.out.println(internetSubeButonu);
	
		if(dolarBugun < dolarDun ) {
			System.out.println("Dolar d��t� resmi");
		}else if(dolarBugun > dolarDun ){
			System.out.println("Dolar y�kseldi resmi");
		}else {
			System.out.println("Dolar e�ittir resmi");

		}
	
	}

}
