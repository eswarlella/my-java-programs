package javaconcepts;

public class Test2 {

	public static boolean m1(int a , int b) {
		boolean res = (a==b);
		return res;
	}
	
	public static void main(String[] args) {
		boolean x= m1(10,20);//F
		System.out.println(!x);//T

	}

}
