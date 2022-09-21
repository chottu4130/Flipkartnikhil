package Array;

public class Duplicate 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,10,20,60,4,5,10};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				
			if(a[i]==a[j])
			{
				count++;
			}
			}
			if(count>=1)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
