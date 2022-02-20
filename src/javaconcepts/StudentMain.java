package javaconcepts;

public class StudentMain {

	public static void main(java.lang.String[]args)
	
	{
		
		
		Student s1 = new Student();
		
	
		System.out.println("Printing getters before setting any value  ");
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getRollNo());
	System.out.println("setting  values    ");
		s1.setName("eswar");
		s1.setAddress("chirala");
		s1.setRollNo(72);
		System.out.println("values set  ");
		System.out.println("getting values after set  ");
		System.out.println(s1.getAddress());
		System.out.println(s1.getName());
		System.out.println(s1.getRollNo());
		
		System.out.println("printing to string method () ");
	//	System.out.println(s1.toString());
		
		
		
		Student s2 = new Student("nikhil", "hyderabad", 1429296);
		System.out.println("s2 name is "+s2.getName());
		
	}
	
	
	
	
	
	
	
	
	
}
