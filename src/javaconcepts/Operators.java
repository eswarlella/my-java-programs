package javaconcepts;

public class Operators {
	
	public static void main(String []args) {
		//unary operator
		int a=10,b=10;
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		//assignment operator
		int x=11,y=12;
		int sum =0;
		//x=x+y;
		//System.out.println(x);
		y+=x; // y = y+x;
		y-=x; // y = y-x;
		System.out.println(y);
		
		int d=20,e=30,f=40;
		System.out.println(d>e||d<f);
		System.out.println(d>e|d<f);
		
		System.out.println(d>e||d++<f);
		System.out.println(d);
		System.out.println(d>e|d++<f);
		System.out.println(d);
	}

}
