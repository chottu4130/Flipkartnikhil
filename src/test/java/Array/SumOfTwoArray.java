package Array;

public class SumOfTwoArray 
{

	public static void main(String[] args)
	{
		int a[]= {1,2,3,5,8};
		int b[]= {3,6,5,3,9,8};
		
		
		/*
		  if fixed no of size in both array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+b[i]);
		}
		
      */
		
		int count =a.length;
		if(a.length<b.length)
			
		{
			count=b.length;

		}
		
		for(int i=0;i<count;i++)
		
			try 
		    {
				
				System.out.println(a[i]+b[i]);
			} 
	        	catch (Exception e) 
		        {
				if(a.length>b.length)
					
				{
					System.out.println(a[i]);
				}
				
				else
					
				{
					System.out.println(b[i]);
				}
				
			}
		
	}

}
