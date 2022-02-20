package javaconcepts;

public class Student {
//java automatically creates default constructor
	// but when you add any parameter constructor , you need to explicitly write the default constructor
	String name; //eswar
	String address; //chirala
	long rollNo; //72
	
	
		public Student () {
			
		}

	public Student(String n, String a, long r) {
		this.name=n;
		this.address=a;
		this.rollNo=r;
		
	}

	public String getName() 
	{
		return name; 
	}
	
	public String getAddress()
	{
		return address;
	}	
	
	public long getRollNo()
	{
		return rollNo;
	}
	
	public void setName(String newName) 
	{
		this.name = newName;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setRollNo(long rollNo)
	{
		this.rollNo = rollNo;
	}
	
	
	
	
	
	
	
}
