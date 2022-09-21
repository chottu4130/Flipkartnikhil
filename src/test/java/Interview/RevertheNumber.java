package Interview;

public class RevertheNumber 
{

	public static void main(String[] args)
	{
		int a=123456;
		int temp=a;
		int rev=0;
		while(a>0)
			
		{
			int last=a%10;
			rev=rev*10+last;
			
			
			a=a/10;
			
			
		}
		System.out.println(rev);
		if(rev==temp)
			
		{
			System.out.println("plan");
		}
		else
			
		{
			System.out.println("not");
		}
	}

}
//123456=21=3