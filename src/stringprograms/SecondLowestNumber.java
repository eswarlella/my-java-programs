package stringprograms;

public class SecondLowestNumber {
	int[]a= {33,55,77,4,31,7,99};
	int l =a.length;
	int temp;{
	
	for(int i=0;i<l;i++)
	{
		for(int j=i+1;j<l;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
			}
		}
		
	}
	
	System.out.println(a[1]);
}
}
