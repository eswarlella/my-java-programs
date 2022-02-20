package javaconcepts;

public class MethodWithReturnValue1 {
	
	
public static int square(int n) {
		
		int res = n*n;
		
		System.out.println(res);
		return res;
}

	public static void main(String[] args) {
		square(3);

	}

}
