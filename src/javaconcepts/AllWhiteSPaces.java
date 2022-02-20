package javaconcepts;

public class AllWhiteSPaces {

	public static void main(String[] args) {
		String s = "Eswar is a Senior Automation Test lead";
		s= s.replaceAll("\\s","" );
		System.out.println(s);
	}

}
