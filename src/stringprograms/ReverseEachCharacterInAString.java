package stringprograms;

public class ReverseEachCharacterInAString {

	public static void main(String[] args) {
		
String s="samarth is a good boy";
		
		String[]word= s.split(" ");

		String actualreversed ="";

		for(String w:word)
		{
			String rev="";
			
			for(int i=w.length()-1;i>=0;i--)
			{
			rev=rev+w.charAt(i);
			}
			
			actualreversed = actualreversed+rev+" ";	

		}
		System.out.println("Reversed String ::"+actualreversed);

	}

	}


