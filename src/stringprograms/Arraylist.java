package stringprograms;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		//creating an array list
		ArrayList <Integer>al=new ArrayList<Integer>();
		
		for(int i=1;i<=1000;i++) {
			al.add(i);
			
			//printing  elements present in the array list.
			System.out.println(al);
			
			System.out.println(al.get(i));
			
			
			
		}
		
		

	}

}
