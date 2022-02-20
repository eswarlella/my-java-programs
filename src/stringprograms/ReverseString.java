package stringprograms;

public class ReverseString {
	public static void main(String[] args) {
		String s= "ABCD";
		
		int len =s.length();
		
		String rev="";;
		int i=len-1;
		while(i>=1) {
			
			rev = rev+s.charAt(i);	
			i--;
			}
		System.out.println(rev);
		
		}
		
		/*for(int i=len-1;i>=0;i--) {
		
			rev = rev+s.charAt(i);
		}
			System.out.println(rev);
		
	}*/

}
