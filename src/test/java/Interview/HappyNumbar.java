package Interview;

public class HappyNumbar 
{

	public static void main(String[] args) 
	{
		int i=223549;
				
		int sum=0;
	    while(i>9)
		
	{
		while(i>0)
			
		{
			int rev=i%10;
			sum=sum+rev;
			i=i/10;
		}
	}
		i=sum;
		System.out.println(sum);
		System.out.println(i);
		if(sum>9)
			
		{
			System.out.println("happy num");
		}
		
		else
			
		{
			System.out.println("not happy num");
		}
	}

	}


